package com.junction.booklibrary.semiproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.junction.booklibrary.semiproject.models.Book;

import java.util.List;

import booklibrary.junction.com.semiproject.R;

/**
 * Created by Sayed El-Abady on 10/1/2018.
 */

public class BooksRecAdapter extends RecyclerView.Adapter<BooksRecAdapter.ViewHolder> {
    List<Book> bookList;
    public BooksRecAdapter(List<Book> books){
        bookList = books;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.book_rec_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(rootView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.bookName.setText(bookList.get(position).getBookName());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView bookName;
        public ViewHolder(View itemView) {
            super(itemView);
            bookName = itemView.findViewById(R.id.book_name_tv);
        }
    }
}
