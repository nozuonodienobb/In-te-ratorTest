package com.example.xiaobai.interatortest;


/**
 * 对象的集合
 */
public class BookShelf implements  Aggregate{

    private Book [] books;
    private int index = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        if (index > books.length -1) {
            return books[books.length - 1];
        } else if (index < 0) {
            return books[0];
        }else {
            return books[index];
        }
    }

    public void addBook(Book book) {
        this.books[index] = book;
        index ++;
    }

    public int getLength() {
        return index;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
