package com.junction.booklibrary.semiproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.junction.booklibrary.semiproject.models.Book;

import booklibrary.junction.com.semiproject.R;

public class AddNewBook extends AppCompatActivity {

    private EditText bookNameEt;
    private EditText bookAuthorEt;
    private EditText bookWriterEt;
    private EditText bookDescriptioEt;
    private EditText bookEditionEt;
    private Button addBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_book);
        initView();

        addBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Book book = new Book();
                book.setBookName(bookNameEt.getText().toString());
                book.setBookAuthor(bookAuthorEt.getText().toString());
                book.setBookWriter(bookWriterEt.getText().toString());
                book.setBookDesc(bookDescriptioEt.getText().toString());
                book.setBookEdition(bookEditionEt.getText().toString());
                book.save();
                finish();
            }
        });
    }

    private void initView() {
        bookNameEt = (EditText) findViewById(R.id.book_name_et);
        bookAuthorEt = (EditText) findViewById(R.id.book_author_et);
        bookWriterEt = (EditText) findViewById(R.id.book_writer_et);
        bookDescriptioEt = (EditText) findViewById(R.id.book_descriptio_et);
        bookEditionEt = (EditText) findViewById(R.id.book_edition_et);
        addBook = (Button) findViewById(R.id.add_book);
    }
}
