package com.qspider.fileHnadling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter f1=new FileWriter("c://File//f1.txt");
        f1.write("java Programing");
        f1.close();
        System.out.println("Data inserted successfully");
    }
}
