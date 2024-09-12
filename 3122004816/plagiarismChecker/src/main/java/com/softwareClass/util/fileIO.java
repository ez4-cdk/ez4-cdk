package com.softwareClass.util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class fileIO {
    //读取
    public static String readFile(String filePath) throws IOException {
        return Files.readString(Paths.get(filePath));
    }

    //写入
    @SuppressWarnings({"ResultOfMethodCallIgnored", "MalformedFormatString"})
    public static void writeOutput(String filePath, Object T) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(String.format("%.2f", T));
        }
    }
}
