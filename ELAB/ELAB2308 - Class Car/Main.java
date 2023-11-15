import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Vector<Car> cars = new Vector<Car>();
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String type = sc.next();
            double price = sc.nextDouble();
            int year = sc.nextInt();
            
            Car car;
            if(type.equals("SC")) {
                car = new SportCar(price, year);
            } else if (type.equals("CC")) {
                car = new ClassicCar(price, year);
            } else {
                continue;
            }
            
            cars.add(car);
        }

        for(Car car : cars) {
            System.out.println(car);
        }
        System.out.println(Car.getMostExpensive());
    }
}

class Car {
    protected double price;
    protected int year;
    public static double maxPrice = 0;
    
    public Car(double price, int year) {
        this.price = price;
        this.year = year;
    }
    
    @Override
    public String toString() {
        return String.format("Price: %.2f VND | Year: %d", price, year);
    }
    
    public double calculateSalePrice() {
        return price;
    }
    
    public static String getMostExpensive() {
        DecimalFormat df = new DecimalFormat("#,###,###,###.00");
        return String.format("Most Expensive: %s VND", df.format(maxPrice));
    }
}

class ClassicCar extends Car {
    public ClassicCar(double price, int year) {
        super(price, year);
        if(calculateSalePrice() > maxPrice) {
            maxPrice = calculateSalePrice();
        }
    }    
    
    @Override
    public double calculateSalePrice() {
        return price * 1.12 + 20000000;
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###,###,###.00");
        return String.format("Price: %s VND | Year: %d", df.format(calculateSalePrice()), year);
    }
}

class SportCar extends Car {
    public SportCar(double price, int year) {
        super(price, year);
        if(calculateSalePrice() > maxPrice) {
            maxPrice = calculateSalePrice();
        }
    }   
    
    
    
    @Override
    public double calculateSalePrice() {
        if(year > 2018) {
            return price * 0.8;
        } else if (year > 2010 && year <= 2018) {
            return price * 0.5;
        } else {
            return price * 0.1;
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###,###,###.00");
        return String.format("Price: %s VND | Year: %d", df.format(calculateSalePrice()), year);
    }
}


