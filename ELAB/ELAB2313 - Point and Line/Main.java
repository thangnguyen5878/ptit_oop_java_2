import java.util.*;

class Point {
    // Private variables
    private double x; // x co-ordinate
    private double y; // y co-ordinate
    private double z; // z co-ordinate

    // Constructor
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Public methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}

class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2) + Math.pow(p2.getZ() - p1.getZ(), 2));
    }

    public void display() {
        String output = String.format("Line %s%s: %.2f", p1, p2, getLength());
        System.out.println(output);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Point> points = new ArrayList<>();

        // Nhập dữ liệu
        while (scanner.hasNext()) {
            String name = scanner.next();
            if (name.equals("end")) {
                break;
            }
            
            // Nhập tọa độ
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();

            Point point = new Point(x, y, z);
            points.add(point);
        }

        // Kiểm tra dữ liệu đầu vào
        if (points.size() < 2) {
            System.out.println("invalid input");
        } else {
            Point start = points.get(points.size() - 1); // Điểm đầu tiên trong danh sách

            // Tính và hiển thị độ dài của các đoạn thẳng
            for (int i = 0; i < points.size() - 1; i++) {
                Line line = new Line(start, points.get(i));
                line.display();
            }
        }
    }
}
