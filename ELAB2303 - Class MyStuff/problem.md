### Đề bài
Cho đoạn mã như sau:
```java
class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
        System.out.println("My Stuff is: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");
        
        // a.
        if (m2.equals(m1))
            System.out.println("same");
        else
            System.out.println("different");

        // b. Viết thêm code vào dấu ...
        ...
    }
}
```
a. Sử dụng LiveIDE để chạy chương trình. Hai đối tượng m1 và m2 đều được khởi tạo với giá trị "PC" nhưng kết quả chạy chương trình là different (câu lệnh a.). Không thay đổi mã trong lớp Main, hãy sửa lại đoạn code cho đúng.
b. Viết thêm câu lệnh so sánh hai tham chiếu và in ra same/different nếu tham chiếu là giống/khác
### Dữ liệu vào
rỗng

### Dữ liệu ra
Dòng đầu tiên là kết quả so sánh giá trị theo định dạng:
value compared: ___
Dòng thứ hai là kết quả so sánh tham chiếu theo định dạng:
reference compared: ___
Với ___ là same hoặc different

### Ví dụ
Input #1 
bài tập không có dữ liệu mẫu

Output #1 
bài tập không có dữ liệu mẫu