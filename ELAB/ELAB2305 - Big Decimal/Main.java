import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < testCase; t++) {
            String[] numbers = sc.nextLine().split(" ");
            BigDecimal sum = BigDecimal.ZERO;
            for (String number : numbers) {
                BigDecimal decimalNum = new BigDecimal(number);
                BigDecimal fraction = decimalNum.remainder(BigDecimal.ONE);
                sum = sum.add(fraction);
            }
            System.out.println(sum.toPlainString());
        }
    }
}