import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();   
        sc.nextLine();

        int[] items = new int[testCases];
        for(int t = 0; t < testCases; t++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            int num5 = sc.nextInt();
            sc.nextLine();
            int result = sum(num1, num2, num3, num4, num5);

            items[t] = result;

            
        }
        for(int item: items) {
                System.out.println(item);
        }
    }

    public static int sum(int num1, int num2, int num3, int num4, int num5) {
        return num1 + num2 + num3+ num4+ num5;
    }
}
