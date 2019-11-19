package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
* Creating new directory
* Creating new .txt file in newly created directory
* Copy data from existing file into newly created .txt file
*/
public class Method6CopyWrite {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("C:\\Users\\vcrisac\\IdeaProjects\\InputOutputStreaming\\Files\\file3.txt");
        if (Files.exists(path1)){
            // choose name for directory to create
            Path pathNewDir = Paths.get("C:\\Users\\vcrisac\\IdeaProjects\\InputOutputStreaming\\Files\\testDir");
            // create directory
            Path newDir = Files.createDirectory(pathNewDir);
            Path pathNewFile = Paths.get("C:\\Users\\vcrisac\\IdeaProjects\\InputOutputStreaming\\Files\\testDir\\testFile.txt");
            Path newFile = Files.createFile(pathNewFile);
            // choose file to write data
            Path writeFile = Paths.get(pathNewFile+"");
            List<String> context = Files.readAllLines(path1);

            Files.write(writeFile, context);
        }
    }
}
