package com.qspider.j2ee;


public class LibraryManagement {
    public static Library getLibrary(){
        Library l=new LibraryImplimentaion();
        return l;
    }

}
