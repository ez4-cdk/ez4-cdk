
import com.softwareClass.entity.Fraction;
import com.softwareClass.util.ExpressionEvaluator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExpressionEvaluatorTest {

    private final ExpressionEvaluator evaluator = new ExpressionEvaluator();

    @Test
    void testEvaluateSimpleAddition() {
        Fraction result = evaluator.evaluate("1/2 + 1/3");
        assertEquals("5/6", result.toString());
    }

    @Test
    void testEvaluateComplexExpression() {
        Fraction result = evaluator.evaluate("1/2 + 1/3 - 1/6");
        assertEquals("2/3", result.toString());
    }

    @Test
    void testEvaluateMultiplication() {
        Fraction result = evaluator.evaluate("2 * 3/4");
        assertEquals("1'1/2", result.toString());
    }

    @Test
    void testEvaluateDivision() {
        Fraction result = evaluator.evaluate("3/4 / 1/2");
        assertEquals("1'1/2", result.toString());
    }

    @Test
    void testEvaluateWithMixedNumbers() {
        // Assuming mixed numbers are supported and fractions can parse them correctly
        Fraction result = evaluator.evaluate("2'1/2 + 1/2");
        assertEquals("3", result.toString());
    }

    @Test
    void testEvaluateWithBrackets() {
        Fraction result = evaluator.evaluate("(1/2 + 1/3) * (3/4 - 1/8)");
        assertEquals("25/48", result.toString());
    }

    @Test
    void testEvaluateInvalidExpression() {
        assertThrows(IllegalArgumentException.class, () -> evaluator.evaluate("1/2 + a"),
                "无效的数学表达式应该抛出异常");
    }

    @Test
    void testEmptyExpression() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> evaluator.evaluate(""),
                "表达式为空! 应该抛出 IllegalArgumentException");
        assertEquals("表达式为空!", exception.getMessage());
    }

}
