package com.softwareClass.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SuppressWarnings("ALL")
public class fileIO {
    //读取
    public static String readFile(String filePath) throws IOException {
        return Files.readString(Paths.get(filePath));
    }

    //写入
    public static void writeOutput(String filePath, Object T) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(String.format("%.2f", T)); // 保留四位小数
        }
    }
}
