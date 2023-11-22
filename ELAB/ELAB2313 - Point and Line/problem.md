## ELAB2313 - Point and Line

### Đề bài

Một lớp đường thẳng (Line) trên hệ trục tọa độ Oxyz được định nghĩa từ lớp điểm (Point) theo quan hệ thừa kế.

Hoàn thiện lớp điểm (Point) được định nghĩa như sau:

```java
class Point {
    // Private variables
    private double x; // x co-ordinate
    private double y; // y co-ordinate
    private double y; // y co-ordinate
    // Constructor
    public Point (double x, double y, double z) {...}
    
    // Public methods
    ...
}

```

- Định nghĩa lớp đường thẳng (Line) cùng các hàm khởi tạo phù hợp.
- Định nghĩa phương thức tính độ dài đường thẳng.

### Dữ liệu vào

Dữ liệu vào có thể bao gồm một hoặc nhiều điểm.

Mỗi điểm bao gồm tên điểm trên một dòng, dòng theo sau đó là ba tọa độ x, y, z tương ứng.

Dòng cuối cùng là tên điểm đầu.

### Dữ liệu ra

Độ dài của tất cả các đường thẳng bắt đầu từ điểm đầu trong dữ liệu vào.

Độ chính xác hai chữ số đằng sau dấu phảy.

Với định dạng dữ liệu vào không chính xác, in ra: invalid input

### Ví dụ

Input #1 
```
A
124.2 1.3 0.4
B
0.3 0.4 1.0
C
0.5 0.5 0.5
C
```


Output #1 
```
Line CA: 123.70
Line CB: 0.55
```
