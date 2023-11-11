import java.util.*;
class Student {
    private String name;
    private int age;
    public static int numberOfStudent = 0;

    public String getName() {
        return this.name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfStudent++;
    }

    public void display(){
        if(age > 18) {
            System.out.println(this.getName());
        }
    }
}

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            students.add(new Student(name, age));
        }

        for (Student student : students) {
            student.display();
        }
        System.out.println(Student.numberOfStudent);
    }
}