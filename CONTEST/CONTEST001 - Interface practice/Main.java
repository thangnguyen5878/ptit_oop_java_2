interface Packable {
    double weight();
}

class Book implements Packable {
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }

    public String toString() {
        return author + ": " + name;
    }
}

class CD implements Packable {
    private String artist;
    private String name;
    private int publicationYear;
    private double weight;

    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    public double weight() {
        return weight;
    }

    public String toString() {
        return artist + ": " + name + " (" + publicationYear + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 1.2);
        Book book2 = new Book("Robert Martin", "Clean Code", 0.8);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.9);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        Packable[] items = {book1, book2, book3, cd1, cd2, cd3};

        for (Packable item : items) {
            System.out.println(item.toString());
        }
    }
}