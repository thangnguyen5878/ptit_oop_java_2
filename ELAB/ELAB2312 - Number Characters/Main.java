import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<>();

        // Đọc dữ liệu từng dòng cho đến khi gặp dòng trống
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            // Kiểm tra nếu dòng là trống thì dừng nhập
            if (line.isEmpty()) {
                break;
            }

            // Gọi phương thức để in ra tổng số kí tự là chữ số trên mỗi dòng
            int digitCount = countDigits(line);
            items.add(digitCount);
        }

        for (int item : items) {
            System.out.println(item);
        }

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức để đếm số lượng chữ số trong một chuỗi
    private static int countDigits(String str) {
        int digitCount = 0;

        // Duyệt qua từng kí tự trong chuỗi
        for (char c : str.toCharArray()) {
            // Kiểm tra nếu là chữ số
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        return digitCount;
    }
}
