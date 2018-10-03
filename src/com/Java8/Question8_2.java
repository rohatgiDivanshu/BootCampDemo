package com.Java8;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question8_2 {
    public static void main(String[] args) {
        try {
            File file = new File("/tmp/employee/divanshu.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] bytes = new byte[2935];
            bufferedOutputStream.write("Writing data to a file".getBytes());
            bufferedOutputStream.write(" using BufferedOutputStream".getBytes());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
