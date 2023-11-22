import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcaseNum = sc.nextInt();
        sc.nextLine(); 
        int[]
        Vector<String> strings = new Vector<String>();

        for (int t = 0; t < testcaseNum; t++) {
            String s = sc.nextLine();
            strings.add(s);
        }

        for (String s:strings) {
            StringBuffer sBuffer = new StringBuffer();
            sBuffer.append(s);
            System.out.println(sBuffer.reverse());
        }
    }
}
