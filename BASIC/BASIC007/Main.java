import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);
        System.out.println(tapeMeasure.toString());
        System.out.println(plaster.toString());
        System.out.println(tyre.toString());
    }
}

class Product {
    public String name;
    public String position;
    public int weight;

    public Product(String name) {
        this.name = name;
        this.position = "self";
        this.weight = 1;
    }

    public Product(String name, String location) {
        this.name = name;
        this.position = location;
        this.weight = 1;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.position = "self";
        this.weight = weight;
    }

    public String toString() {
        return String.format("%s (%dkg) can be found from the %s", name, weight,
                             position);
    }
}