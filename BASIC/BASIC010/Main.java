import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student ollie =
            new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits " + ollie.credits());
    }
}

class Person {
    private String name;
    private String address;
    private int credits = 0;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", name, address);
    }
}

class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int credits() {
        return credits;
    }

    public void study() { credits++; }
}