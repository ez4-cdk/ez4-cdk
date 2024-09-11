package com.softwareClass;

import com.softwareClass.util.calculator;
import com.softwareClass.util.extractor;
import com.softwareClass.util.fileIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class plagiarismChecker {
    private static final Logger logger = LogManager.getLogger(plagiarismChecker.class);
    public static void main(String[] args) {
        try {

            //新建命令行输入对象
            String origFilePath = args[0];
            String plagiarismFilePath = args[1];
            String outputFilePath = args[2];

            //读取文件
            String origText = fileIO.readFile(origFilePath);
            String plagiarizedText = fileIO.readFile(plagiarismFilePath);

            //提取文章关键字
            Map<String, Integer> origFrequency = extractor.extractWordFrequency(origText);
            Map<String, Integer> plagiarizedFrequency = extractor.extractWordFrequency(plagiarizedText);

            //计算余弦相似度
            double similarityRate = calculator.calculateCosineSimilarity(origFrequency, plagiarizedFrequency);

            //写入计算结果
            fileIO.writeOutput(outputFilePath, similarityRate);
        } catch (Exception e) {
            logger.error("错误信息：{}", e.getMessage());
        }
    }
}
