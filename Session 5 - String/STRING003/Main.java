import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcaseNum = sc.nextInt();
        sc.nextLine(); 

        Vector<String> strings = new Vector<String>();

        for (int t = 0; t < testcaseNum; t++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            strings.add(s1);
            strings.add(s2);
        }

        for (int i = 0, n = strings.size(); i < n; i += 2) {
            String s1 = strings.get(i).toLowerCase();
            String s2 = strings.get(i + 1).toLowerCase();
            System.out.println(s1.equals(s2));
        }
    }
}
