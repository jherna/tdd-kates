import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * https://osherove.com/tdd-kata-1
 */
public class StringCalculatorTest {

    @Test
    public void addVoidStringTest() {
        StringCalculator sc = new StringCalculator();
        int sum = sc.add("");
        assertEquals(sum,0);
    }

    @Test
    public void addRandomSingleNumberStringTest() {
        StringCalculator sc = new StringCalculator();
        int sum = sc.add("1200");
        assertEquals(sum,1200);
    }

    @Test
    public void addNumbersStringTest() {
        StringCalculator sc = new StringCalculator();
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
        StringCalculator sc = new StringCalculator();
        //int sum = sc.add("-1");
        ArithmeticException e = assertThrows(ArithmeticException.class,() -> sc.add("-2"));
        assertEquals("Negatives not allowed: -2", e.getMessage());
    }

    @Test
    public void addOneNegativeAndPositiveNumberStringTest() {
        StringCalculator sc = new StringCalculator();
        //int sum = sc.add("-1");
        ArithmeticException e = assertThrows(ArithmeticException.class,() -> sc.add("1,-2"));
        assertEquals("Negatives not allowed: -2", e.getMessage());
    }

    @Test
    public void addTwoNegativeAndPositiveNumberStringTest() {
        StringCalculator sc = new StringCalculator();
        //int sum = sc.add("-1");
        ArithmeticException e = assertThrows(ArithmeticException.class,() -> sc.add("1,-2,-3"));
        assertEquals("Negatives not allowed: -2,-3", e.getMessage());
    }


}
