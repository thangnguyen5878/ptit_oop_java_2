## EXCEPTION001 - Defined Exception


### Đề bài

Hoàn thiện đoạn mã theo chỉ dẫn dưới đây:

```java
class FileNameFormatExeption{
    // Định nghĩa ngoại lệ mới
}

class Test {
    public static void open_file(String s){
        try {
            // Gọi phương thức f() ném ngoại lệ
            f(s);
        } catch (FileNameFormatExeption fname) {
            System.out.println(fname.getMessage());
        } catch (Exception e){
            System.out.println("Exception");
        }
    }

    public static void f(String s){
        // Định nghĩa phương thức f() 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Test.open_file(s);
        sc.close();
    }
}
```

Ngoại lệ FileNameFormatException được định nghĩa để xử lý trường hợp tên file có chứa dấu cách " ".

### Dữ liệu vào

Dữ liệu vào là một dòng bao gồm tên file.

### Dữ liệu ra

Dữ liệu ra là kết quả của lời gọi phương thức open_file()

- Nếu có ngoại lệ in ra: **File name format**
- Nếu không in ra: **File opened**

### Ví dụ

Input #1 

Bài tập không có dữ liệu mẫu

Output #1 

Bài tập không có dữ liệu mẫu