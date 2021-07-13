import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * https://osherove.com/tdd-kata-1
 */
public class StringCalculatorTest {
    StringCalculator sc;

    @BeforeEach
    public void createStringCalculator() {
        sc = new StringCalculator();
    }

    @Test
    public void addVoidStringTest() {
        int sum = sc.add("");
        assertEquals(sum,0);
    }

    @Test
    public void addRandomSingleNumberStringTest() {
        int sum = sc.add("1200");
        assertEquals(sum,1200);
    }

    @Test
    public void addNumbersStringTest() {
        int sum = sc.add("1\n2,3;4");
        assertEquals(sum,10);
    }

    /**
     * Calling Add with a negative number will throw an exception “negatives not allowed” -
     * and the negative that was passed.
     *
     * if there are multiple negatives, show all of them in the exception message.
     */

    @Test
    public void addOneNegativeNumbersStringTest() {
        ArithmeticException e = assertThrows(ArithmeticException.class,() -> sc.add("-2"));
        assertEquals("Negatives not allowed: -2", e.getMessage());
    }

    @Test
    public void addOneNegativeAndPositiveNumberStringTest() {
        ArithmeticException e = assertThrows(ArithmeticException.class,() -> sc.add("1,-2"));
        assertEquals("Negatives not allowed: -2", e.getMessage());
    }

    @Test
    public void addTwoNegativeAndPositiveNumberStringTest() {
        ArithmeticException e = assertThrows(ArithmeticException.class,() -> sc.add("1,-2,-3"));
        assertEquals("Negatives not allowed: -2,-3", e.getMessage());
    }


}
