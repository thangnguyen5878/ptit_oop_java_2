interface A{
    void m();
    void n(String msg);
}
class C implements A{
    public void m(){
        System.out.println("Method m() of C");
    }
    
    public void n(String msg){
        System.out.println("OOP23 " + msg);
    }
}

class D extends C {
    public boolean d=true;
}

public class Main{
      public static void main(String[] args) {
            D b = new D();
            b.m();
            b.n("OOP23");
            System.out.println(b.d);
        }
    }