class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
        
    }
    
    public boolean equals(MyStuff m) {
        return this.name == m.name;
    }
}
public class Main {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");
        
        // a.
        if (m2.equals(m1))
            System.out.println("value compared: same");
        else
            System.out.println("value compared: different");

        // b. So sanh ket qua tham chieu
        if (m1 == m2)
    		System.out.println("reference compared: same");
		else
    		System.out.println("reference compared: different");
    }
}