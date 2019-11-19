package com.company;

import java.io.*;

public class Method1BufferedReader {

    public static void main(String[] args) throws IOException {
        // 1 - read from file by creating a File object and put the path to the file with some text

        File fileIn = new File("C:\\Users\\vcrisac\\IdeaProjects\\InputOutputStreaming\\Files\\readfile1.txt");
        File fileOut = new File("C:\\Users\\vcrisac\\IdeaProjects\\InputOutputStreaming\\Files\\writefile1.txt");

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileIn));
        FileInputStream fis = new FileInputStream(fileIn);
        FileOutputStream fos = new FileOutputStream(fileOut);

//        String text;
        int text;
        while((text = fis.read()) != -1){
//            System.out.println(text);
            // write to file
            fos.write(text);
        }
        fis.close();

/*
        StringBuilder sb = new StringBuilder();
        String line = bufferedReader.readLine();

        while (line != null){
            sb.append(line);
            sb.append(System.lineSeparator());
            line = bufferedReader.readLine();
        }
        String text = sb.toString();
*/

    }
}
