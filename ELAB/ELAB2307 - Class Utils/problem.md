### Đề bài
Lớp Utils định nghĩa hai phương thức u() và z(). Hãy sữa lỗi đoạn mã nguồn lớp Utils:
```java
class Utils {
    public static void u(String s) {
        try {
            System.out.println(s);
            z(s);
            try {
                System.out.println(Integer.parseInt(s)+1);
            } catch (e) {
                System.out.println(s.toUpperCase());
            }
        } catch (ClassNotFoundException e) {
            System.out.println(1);
        }
    }

    public void z(String s){
        System.out.println(2);
        if (s.length() == 1)
            throw new IOException();
        System.out.println(3);
    }
}
```
Hoàn thiện đoạn mã để chạy và in ra kết quả khi gọi phương thức u() với tham số truyền vào là một chuỗi

### Dữ liệu vào
Một chuỗi kí tự  
### Dữ liệu ra
Kết quả khi gọi phương thức nêu trên.  
### Ví dụ
Input #1 

bài tập không có dữ liệu mẫu

Output #1 

bài tập không có dữ liệu mẫu