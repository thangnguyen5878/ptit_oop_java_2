import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vector<Car> cars = new Vector<Car>();
        
;       Scanner sc = new Scanner();
        int t = sc.nextInt(System.in);
        while(t--) {
            String type = sc.next();
            double price = sc.nextDouble();
            int year = sc.nextInt();
        }
        
        Car car;
        if(type == "SC") {
            car = new SportCar();
        } else if (type == "CC") {
            car = new ClassicCar();
        }
        
        cars.add(car);
    }
}

class Car {
    protected double price;
    protected int year;
    public static double maxPrice = 0;
    
    public Car(double price, int year) {
        this.price = price;
        this.year = year;
        if(price > maxPrice) {
            maxPrice = price;
        }
    }
    
    @override
    public String toString{
        return String.format("Price: %.2f | Year: %d", price, year);
    }
    
    public double calculateSalePrice() {
        return price;
    }
    
    public static String getMostExpensive() {
        DecimalFormat df = new DecimalFormat("#,###,###,###.00");
        return String.format("Most Expensive: %s VND", df.format(maxPrice));
    }
}

class SportCar extends Car {
    @override
    public SportCar(String type, double price, int year) {
        supper(double price, int year);
        this.type = type;
    }   
    
    @override
    public SportCar(String type, double price, int year) {
        supper(double price, int year);
        this.type = type;
    }    
    
    @override
    public double calculateSalePrice() {
        return price*1.12;
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###,###,###.00");
        return String.format("Loại xe: SportCar, Giá: %s VND, Năm sản xuất: %d",
                df.format(price), year);
    }
}

class ClassicCar extends Car {
    @override
    public ClassicCar(String type, double price, int year) {
        supper(double price, int year);
        this.type = type;
    }    
    
    @override
    public double calculateSalePrice() {
        if(year > 2018) {
			return price*0.8;
        } else if (year > 2010 && year <= 2018) {
            return price*0.5;
        } else {
            return price*0.1;
        }
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###,###,###.00");
        return String.format("Loại xe: ClassicCar, Giá: %s VND, Năm sản xuất: %d",
                df.format(price), year);
    }
}