import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.trim().isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name is not valid");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age is not valid");
        }

        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + "--Age:" + age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine(); // consume the newline after the number of test cases

        for (int i = 0; i < testCases; i++) {
            String name = sc.nextLine();
            int age;

            try {
                age = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Age is not valid");
                continue;
            }

            try {
                Person person = new Person(name, age);
                System.out.println(person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}