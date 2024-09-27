
import com.softwareClass.entity.Expression;
import com.softwareClass.entity.Fraction;
import com.softwareClass.util.Generator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratorTest {

    private final Generator generator = new Generator();

    @Test
    void testGenerateOperators() {
        List<Integer> operators = generator.generateOperators();
        assertNotNull(operators, "操作符列表不应为空");

        for (Integer operator : operators) {
            assertTrue(operator >= 0 && operator <= 3, "操作符应在0到3之间");
        }
    }

    @Test
    void testGenerateNumber() {
        int count = 5; // 我们想生成5个数
        int area = 10; // 范围设置为10
        List<Integer> operators = generator.generateOperators(); // 获取一组随机操作符

        // 使用 assertDoesNotThrow 来确保 generateNumber 方法不会抛出异常
        assertDoesNotThrow(() -> {
            List<Fraction> numbers = generator.generateNumber(count, area, operators);

            // 确保生成的数字数量与请求的数量一致
            assertEquals(count, numbers.size(), "生成的数字个数应与请求的相同");

            for (Fraction fraction : numbers) {
                //拒绝生成空的分数
                assertNotNull(fraction, "生成的分数不应为空");
            }
        }, "generateNumber 方法应当顺利执行，不应抛出异常");
    }

    @Test
    void testGenerateExpressions() {
        int numExpressions = 10; // 我们想生成10个表达式
        int area = 10; // 范围设置为10

        List<Expression> expressions = generator.generateExpressions(numExpressions, area);
        assertEquals(numExpressions, expressions.size(), "生成的表达式数量应与请求的相同");

        for (Expression expression : expressions) {
            assertNotNull(expression, "表达式不应为空");
            assertFalse(expression.toString().isEmpty(), "表达式字符串不应为空");
        }
    }

    @Test
    void testGenerateBracket() {
        int num = 5; // 假设我们有5个数
        List<Integer> brackets = generator.generateBracket(num);

        if (brackets != null) {
            assertEquals(2, brackets.size(), "返回的括号列表应包含两个元素");
            assertTrue(brackets.get(0) < brackets.get(1), "左括号索引应小于右括号索引");
            assertTrue(brackets.get(0) >= 0 && brackets.get(0) < num, "左括号索引应在有效范围内");
            assertTrue(brackets.get(1) >= 0 && brackets.get(1) < num, "右括号索引应在有效范围内");
        }
    }

    @Test
    void testGetOperatorSymbol() {
        assertEquals(" + ", generator.getOperatorSymbol(0), "操作符0应返回'+'");
        assertEquals(" - ", generator.getOperatorSymbol(1), "操作符1应返回'-'");
        assertEquals(" * ", generator.getOperatorSymbol(2), "操作符2应返回'*'");
        assertEquals(" / ", generator.getOperatorSymbol(3), "操作符3应返回'/'");

        assertThrows(IllegalArgumentException.class, () -> generator.getOperatorSymbol(4), "无效的操作符应抛出异常");
    }

    @Test
    void testGenerateExpression() {
        List<Integer> operators = List.of(0, 1); // 加法和减法
        List<Fraction> numbers = List.of(new Fraction(1, 2), new Fraction(1, 3)); // 1/2 和 1/3

        String expression = generator.generateExpression(operators, numbers);
        assertNotNull(expression, "生成的表达式不应为空");
        assertFalse(expression.isEmpty(), "生成的表达式应有内容");
    }
}
