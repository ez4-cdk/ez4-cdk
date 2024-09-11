package com.softwareClass.util;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class extractor {
    //提取关键字
    public static Map<String, Integer> extractWordFrequency(String text) {
        text = text.replaceAll("[^\\u4e00-\\u9fa5\\w\\s]", ""); // 保留中文及字母数字
        Segment segment = HanLP.newSegment(); // 创建分词器实例
        List<Term> termList = segment.seg(text); // 使用分词器进行分词

        Map<String, Integer> frequencyMap = new HashMap<>(); // 存储词频的Map
        for (Term term : termList) {
            if (term.nature.toString().startsWith("n")) { // 只提取名词
                frequencyMap.put(term.word, frequencyMap.getOrDefault(term.word, 0) + 1); // 更新词频
            }
        }
        return frequencyMap; // 返回词频Map
    }
}
