
import com.softwareClass.entity.Expression;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {

    @Test
    void testEvaluateSimpleAddition() {
        Expression expression = new Expression("1/2 + 1/3");
        String result = expression.evaluate();
        assertEquals("5/6", result);
    }

    @Test
    void testEvaluateComplexExpression() {
        Expression expression = new Expression("1/2 + 1/3 - 1/6");
        String result = expression.evaluate();
        assertEquals("2/3", result);
    }

    @Test
    void testEvaluateMultiplication() {
        Expression expression = new Expression("2 * 3/4");
        String result = expression.evaluate();
        assertEquals("1'1/2", result);
    }

    @Test
    void testEvaluateDivision() {
        Expression expression = new Expression("3/4 / 1/2");
        String result = expression.evaluate();
        assertEquals("1'1/2", result);
    }

    @Test
    void testEvaluateWithMixedNumbers() {
        Expression expression = new Expression("2'1/2 + 1/2"); // Assuming mixed numbers are supported
        String result = expression.evaluate();
        assertEquals("3", result);
    }

    @Test
    void testEvaluateInvalidExpression() {
        Expression expression = new Expression("1/2 + a");
        assertThrows(IllegalArgumentException.class, expression::evaluate, "无效的数学表达式应该抛出异常");
    }
}
