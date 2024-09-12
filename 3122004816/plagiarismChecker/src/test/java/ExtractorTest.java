import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.softwareClass.util.extractor.extractWordFrequency;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractorTest {
    @Test
    public void testExtractWordFrequency_withChineseText() {
        // 示例输入文本
        String text = "今天天气不错，适合出去玩。";

        // 调用 extractWordFrequency 方法
        Map<String, Integer> frequencyMap = extractWordFrequency(text);

        // 打印调试信息
        System.out.println("分词结果: " + frequencyMap);

        // 创建预期结果
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("天气", 1);
        expectedMap.put("不错", 1);
        expectedMap.put("适合", 1);
        expectedMap.put("出去", 1);
        expectedMap.put("玩", 1);

        // 验证实际结果和预期结果是否相同
        assertEquals(expectedMap, frequencyMap);
    }
}
