public class Main {

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        String s = "1\n3,4\n5";
        //stringCalculator.add(s);
        System.out.printf("%s = %d",s,stringCalculator.add(s));

    }
}
