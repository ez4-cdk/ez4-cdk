package com.softwareClass.util;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class calculator {
    //计算余弦相似度
    public static double calculateCosineSimilarity(Map<String, Integer> origFreq, Map<String, Integer> plagiarizedFreq) {
        Set<String> allWords = new HashSet<>(origFreq.keySet());
        allWords.addAll(plagiarizedFreq.keySet());

        double dotProduct = 0.0;
        double normA = 0.0;
        double normB = 0.0;

        for (String word : allWords) {
            int origCount = origFreq.getOrDefault(word, 0);
            int plagiarizedCount = plagiarizedFreq.getOrDefault(word, 0);

            dotProduct += origCount * plagiarizedCount; // 计算点积
            normA += Math.pow(origCount, 2); // 计算L2范数
            normB += Math.pow(plagiarizedCount, 2); // 计算L2范数
        }

        if (normA == 0 || normB == 0) {
            return 0.0; // 避免除以零
        }

        return dotProduct / (Math.sqrt(normA) * Math.sqrt(normB)); // 计算余弦相似度
    }
}
