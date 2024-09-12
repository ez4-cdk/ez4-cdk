import com.softwareClass.util.calculator;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testCalculateCosineSimilarity_BothEmpty() {
        Map<String, Integer> origFreq = new HashMap<>();
        Map<String, Integer> plagiarizedFreq = new HashMap<>();
        double similarity = calculator.calculateCosineSimilarity(origFreq, plagiarizedFreq);
        assertEquals(0.0, similarity, 0.01);
    }

    @Test
    public void testCalculateCosineSimilarity_OneEmpty() {
        Map<String, Integer> origFreq = new HashMap<>();
        origFreq.put("word1", 3);
        Map<String, Integer> plagiarizedFreq = new HashMap<>();

        double similarity = calculator.calculateCosineSimilarity(origFreq, plagiarizedFreq);
        assertEquals(0.0, similarity, 0.01);
    }

    @Test
    public void testCalculateCosineSimilarity_NonZeroSimilarity() {
        Map<String, Integer> origFreq = new HashMap<>();
        origFreq.put("word1", 3);
        origFreq.put("word2", 5);

        Map<String, Integer> plagiarizedFreq = new HashMap<>();
        plagiarizedFreq.put("word1", 2);
        plagiarizedFreq.put("word2", 4);

        double similarity = calculator.calculateCosineSimilarity(origFreq, plagiarizedFreq);
        assertEquals(0.999846, similarity, 0.01);
    }


    @Test
    public void testCalculateCosineSimilarity_NoCommonWords() {
        Map<String, Integer> origFreq = new HashMap<>();
        origFreq.put("word1", 3);
        origFreq.put("word2", 5);

        Map<String, Integer> plagiarizedFreq = new HashMap<>();
        plagiarizedFreq.put("word3", 2);
        plagiarizedFreq.put("word4", 4);

        double similarity = calculator.calculateCosineSimilarity(origFreq, plagiarizedFreq);
        assertEquals(0.0, similarity, 0.01);
    }
}

