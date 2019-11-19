package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Method4Path {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\vcrisac\\IdeaProjects\\InputOutputStreaming\\Files\\readfile2.txt");
        List<String> content = Files.readAllLines(path);
        for (String text : content) {
            System.out.println(text);
        }

        Path fileWrite = Paths.get("C:\\Users\\vcrisac\\IdeaProjects\\InputOutputStreaming\\Files\\filewrite4.txt");
        Files.write(fileWrite, content);
    }
}
