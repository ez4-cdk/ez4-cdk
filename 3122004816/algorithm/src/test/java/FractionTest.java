import com.softwareClass.entity.Fraction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("AssertBetweenInconvertibleTypes")
public class FractionTest {

    @Test
    void testConstructor() {
        assertThrows(IllegalArgumentException.class, () -> new Fraction(1, 0), "分母不能为零");
        Fraction fraction = new Fraction(3, 4);
        assertEquals(3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testFromString() {
        Fraction fraction1 = Fraction.fromString("3'1/2");
        assertEquals("3'1/2", fraction1.toString());

        Fraction fraction2 = Fraction.fromString("1/4");
        assertEquals("1/4", fraction2.toString());

        Fraction fraction3 = Fraction.fromString("5");
        assertEquals("5", fraction3.toString());
    }

    @Test
    void testAdd() {
        Fraction fraction1 = new Fraction(1, 2); // 1/2
        Fraction fraction2 = new Fraction(1, 3); // 1/3
        Fraction result = fraction1.add(fraction2);
        assertEquals("5/6", result.toString());
    }

    @Test
    void testSubtract() {
        Fraction fraction1 = new Fraction(5, 6); // 5/6
        Fraction fraction2 = new Fraction(1, 3); // 1/3
        Fraction result = fraction1.subtract(fraction2);
        assertEquals("1/2", result.toString());
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(1, 2); // 1/2
        Fraction fraction2 = new Fraction(2, 3); // 2/3
        Fraction result = fraction1.multiply(fraction2);
        assertEquals("1/3", result.toString());
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(1, 2); // 1/2
        Fraction fraction2 = new Fraction(2, 3); // 2/3
        Fraction result = fraction1.divide(fraction2);
        assertEquals("3/4", result.toString());

        assertThrows(IllegalArgumentException.class, () -> fraction1.divide(new Fraction(0, 0)), "不能除以零");
    }

    @Test
    void testGenerateABiggerFraction() {
        Fraction fraction = new Fraction(1, 2); // 1/2
        Fraction biggerFraction = fraction.generateABiggerFraction();
        Fraction result = biggerFraction.subtract(fraction);
        assertTrue(
                result.getNum()>0||result.getNumerator()>0
                ,
                "生成的分数应该大于原分数");
    }

    @Test
    void testSimplify() {
        Fraction fraction = new Fraction(8, 4); // 8/4 should simplify to 2
        assertEquals("2", fraction.toString());
    }
}
