import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String word = input[0];
            char ch = input[1].charAt(0);

            String reversedSubstring = reverseSubstring(word, ch);
            System.out.println(reversedSubstring);
        }

        scanner.close();
    }

    static String reverseSubstring(String word, char ch) {
        int index = word.indexOf(ch);
        if (index != -1) {
            StringBuilder reversed = new StringBuilder(word.substring(0, index + 1)).reverse();
            return reversed.toString() + word.substring(index + 1);
        } else {
            return word;
        }
    }
}