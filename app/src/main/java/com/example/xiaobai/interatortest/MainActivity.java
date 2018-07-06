package com.example.xiaobai.interatortest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    public  void test() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.addBook(new Book("java", "1"));
        bookShelf.addBook(new Book("java", "2"));
        bookShelf.addBook(new Book("java", "3"));
        bookShelf.addBook(new Book("java", "4"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            Log.i("test", book.getName() + book.getId());
        }
    }
}
