import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        int sum = sc.add("1\n2,3");
        assertEquals(sum,6);
    }


}
