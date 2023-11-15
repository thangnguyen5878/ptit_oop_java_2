import java.util.*;

public class Main {
    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}


class SimpleDate {
    public int day;
    public int month;
    public int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(SimpleDate obj) {
        return (this.day == obj.day) && (this.month == obj.month) &&
            (this.year == obj.year);
    }
}
