// wrong
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline sau số nguyên n

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");
            String s = inputs[0];
            int index = Integer.parseInt(inputs[1]);

            char character = s.charAt(index);
            System.out.println("The character at position " + index + " is " + character);
        }

        scanner.close();
    }
}