package com.softwareClass.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileIO {
    //读取
    public static String readFile(String filePath) throws IOException {
        return Files.readString(Paths.get(filePath));
    }

    //写入
    @SuppressWarnings({"ResultOfMethodCallIgnored"})
    public static void writeOutput(String filePath, Object T) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
            writer.write((String) T);
            writer.newLine();
        }
    }
}
