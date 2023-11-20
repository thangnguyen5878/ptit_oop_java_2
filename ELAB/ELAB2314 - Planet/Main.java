// in progress
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double weight = sc.nextDouble();
        sc.nextLine();
        double radius = sc.nextDouble();
        sc.nextLine();
        double weightOnEarth = sc.nextDouble();
        HanhTinh planet = new HanhTinh(weight, radius);
        double w = planet.khoiLuongBeMat(weightOnEarth);
        System.out.println(String.format("Your weight on %s is %.2f", name, w));
    }
}

class HanhTinh {
    private double khoiLuong;
    private double banKinh;
    public static double g = 6.67300e-11;

    public HanhTinh(double khoiLuong, double banKinh) {
        this.khoiLuong = khoiLuong;
        this.banKinh = banKinh;
    }

    public double trongLuongBeMat() {
        return (khoiLuong*g)/(banKinh*banKinh);
    }

    public double khoiLuongBeMat(double weight) {
        double trongLuongTrenTraiDat = (5.976*Math.pow(10,24)*g)/(6.37814*Math.pow(10,6) * 6.37814*Math.pow(10,6));
        return weight * (trongLuongBeMat()/trongLuongTrenTraiDat);
    }   
}