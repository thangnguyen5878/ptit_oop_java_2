import java.util.Scanner;

class NotContainVowelException extends Exception {
    public NotContainVowelException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTestCases = sc.nextInt();
        sc.nextLine(); // consume the newline character after reading the number of test cases

        for (int i = 0; i < numTestCases; i++) {
            String input = sc.nextLine();

            try {
                checkContainVowel(input);
                System.out.println("String has vowels");
            } catch (NotContainVowelException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }

    private static void checkContainVowel(String s) throws NotContainVowelException {
        if (!s.matches(".*[aeiouAEIOU].*")) {
            throw new NotContainVowelException("String not contain vowels");
        }
    }
}
