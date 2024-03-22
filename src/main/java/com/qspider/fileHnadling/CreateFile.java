package com.qspider.fileHnadling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File f1=new File("c://File//f1.txt");
        try {
            if(f1.createNewFile()){
                System.out.println("File Created Successfully...!");
            }else {
                System.out.println("File Exist Already...");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
