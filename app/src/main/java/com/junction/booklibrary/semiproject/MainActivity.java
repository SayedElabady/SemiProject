package com.junction.booklibrary.semiproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import booklibrary.junction.com.semiproject.R;

public class MainActivity extends AppCompatActivity {
    Button addBook, viewBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addBook = findViewById(R.id.add_book_btn);
        viewBooks = findViewById(R.id.view_books_btn);
        addBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddNewBook.class));
            }
        });
        viewBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ViewAllBooks.class));
            }
        });
    }
}
