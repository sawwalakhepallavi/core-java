package com.qspider.j2ee;

public class Librarian {
    public static void main(String[] args) {
        Library l=LibraryManagement.getLibrary();
        l.addBook();
    }
}
