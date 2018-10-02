package com.junction.booklibrary.semiproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.junction.booklibrary.semiproject.models.Book;

import java.util.List;

import booklibrary.junction.com.semiproject.R;

public class ViewAllBooks extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_books);
        recyclerView = findViewById(R.id.rec_view);
        List<Book> books = Book.listAll(Book.class);
        BooksRecAdapter adapter = new BooksRecAdapter(books);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
