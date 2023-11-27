import java.util.Scanner;

class FileNameFormatException extends Exception {
    public FileNameFormatException(String message) {
        super(message);
    }
}

class Test {
    public static void open_file(String s) throws FileNameFormatException {
        try {
            f(s);
            System.out.println("File opened");
        } catch (FileNameFormatException fname) {
            System.out.println(fname.getMessage());
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void f(String s) throws FileNameFormatException {
        if (s.contains(" ")) {
            throw new FileNameFormatException("File name format");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try {
            Test.open_file(s);
        } catch (FileNameFormatException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
