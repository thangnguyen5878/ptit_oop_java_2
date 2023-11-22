import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcaseNum = sc.nextInt();
        sc.nextLine();

        Vector<String> items = new Vector<String>();
        for(int t = 0; t < testcaseNum; t++) {
            String item = sc.nextLine();
            items.add(item);
        }

        for(String item:items) {
            System.out.println(item);
        }
    }
}
