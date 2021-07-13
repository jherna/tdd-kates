import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    public int add(String s) {
        List<String> numbers = new ArrayList<>();
        int sum = 0;
        if(s.equals("")) return 0;
        else {
            numbers = Arrays.asList(s.split("[,\\n;]"));
           // convert toInt
            return numbers.stream().mapToInt(Integer::parseInt).sum();
        }
    }

}
