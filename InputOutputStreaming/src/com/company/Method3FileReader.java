package com.company;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// read from file using FileReader and writing readed data to another file
public class Method3FileReader {
    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("C:\\Users\\vcrisac\\IdeaProjects\\InputOutputStreaming\\Files\\readfile2.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\vcrisac\\IdeaProjects\\InputOutputStreaming\\Files\\filewrite3.txt");

        int intVal;
        char charVal;
        while (((intVal = reader.read()) > 0)){
             charVal = (char) intVal;
//            System.out.print(charVal);
            fos.write(charVal);
        }
    }
}
