import java.util.*;
import java.math.*;

public class BigIntOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng test cases
        int testCases = scanner.nextInt();
        Vector<BigInteger> results = new Vector<BigInteger>();
        // Xử lý từng test case
        for (int i = 0; i < testCases; i++) {
            // Đọc số thứ nhất, phép tính và số thứ hai
            BigInteger num1 = new BigInteger(scanner.next());
            String operation = scanner.next();
            BigInteger num2 = new BigInteger(scanner.next());

            // Thực hiện phép tính dựa trên toán tử
            BigInteger result;
            switch (operation) {
                case "+":
                    result = num1.add(num2);
                    break;
                case "-":
                    result = num1.subtract(num2);
                    break;
                case "*":
                    result = num1.multiply(num2);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operation);
            }

            // In kết quả
            results.add(result);
        }

        for(BigInteger result: results) {
            System.out.println(result);
        }

        // Đóng Scanner
        scanner.close();
    }
}