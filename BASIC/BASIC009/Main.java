import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada.toString());
        System.out.println(esko.toString());
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