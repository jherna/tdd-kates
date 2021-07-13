import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    public int add(String s) throws ArithmeticException {
        StringBuilder stringBuilder = new StringBuilder("Negatives not allowed: ");
        List<String> numbers = new ArrayList<>();
        int sum = 0;
        if(s.equals("")) return 0;
        else {
            numbers = Arrays.asList(s.split("[,\\n;]"));
            List<Integer> ints = convertToInt(numbers);
            List<Integer> negs = new ArrayList<>();
            //Mirar si hi ha negatius
            ints.forEach(n -> {
                if (n < 0) {
                    negs.add(n);
                    if(negs.size() == 1) stringBuilder.append(n);
                    else stringBuilder.append("," + n);
                }
            });
            if(negs.size() > 0)
                throw new ArithmeticException(stringBuilder.toString());
            else
                return ints.stream().mapToInt(Integer::intValue).sum();

        }
    }

    public List<Integer> convertToInt(List<String> nums) {
        return nums.stream().map(Integer::parseInt).toList();
    }

}
