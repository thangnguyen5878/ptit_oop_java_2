import java.util.*;

public class Main {
    public static void main(String[] args) {
    Student matt = new Student();
    matt.play();
    
    }
}

public class Student {

    private int credits;

    public Student() {
        this.credits = 0;
    }

    public void play() {
        this.credits = this.credits - 8;
        System.out.println(credits);
    }

    
}