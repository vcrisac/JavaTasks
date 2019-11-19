package com.company;

import java.io.*;

public class Method5FIS {
    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("C:\\Users\\vcrisac\\IdeaProjects\\InputOutputStreaming\\Files\\readfile2.txt");
        FileInputStream fis = new FileInputStream(fileIn);
        File fileOut = new File("C:\\Users\\vcrisac\\IdeaProjects\\InputOutputStreaming\\Files\\writefile2.txt");
        FileOutputStream fos = new FileOutputStream(fileOut);

        try {
            int line;
            while ((line = fis.read()) != -1) {
//              System.out.print((char) line);
                fos.write((char) line);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
