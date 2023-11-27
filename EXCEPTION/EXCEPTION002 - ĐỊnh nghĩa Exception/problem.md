## EXCEPTION002 - ĐỊnh nghĩa Exception

### Đề bài

Hãy thực hành xác thực tham số với ngoại lệ `IllegalArgumentException`.

Sửa đổi các lớp theo cách sau

Tạo class Person với 2 thuộc tính

- name: String
- age: int

Hàm tạo của lớp Person phải đảm bảo rằng trường `name` được cung cấp làm tham số không rỗng, trống hoặc dài hơn 40 ký tự.

Độ tuổi phải nằm trong khoảng từ 0 đến 120.

Nếu một số điều kiện này không được đáp ứng, hàm tạo sẽ ném ra một ngoại lệ `IllegalArgumentException`.

### Dữ liệu vào

Điều kiện dữ liệu đầu vào bao gồm

- Dòng đầu tiên thể hiện số lượng test case
- Dòng thứ 2 là thể hiện của trường name, được nhập từ bàn phím
- Dòng thứ 3 là thể hiện của trường tuổi, được nhập từ bàn phím

### Dữ liệu ra

- In ra "Name is not valid" nếu như tên không hợp lệ

- In ra "Age is not valid" nếu như tuổi ko hợp lệ

- In ra "Name:<tên>--Age:< age>" nếu như tuổi và tên hợp lệ

### Ví dụ

Input #1 
```
10
VDO
38
7yDbEhZygLXp6VUS
107
ivt
108
WKKqv
221
6mrk
105
Y17lcgB
50
2sebRBkcpn2ijwje
116
QxtsMs9UO
106
r8gDF927pty
214
pjnI3h8E2HYSXNmCwo2f
43
```

Output #1 
```
Name: VDO--Age:38
Name: 7yDbEhZygLXp6VUS--Age:107
Name: ivt--Age:108
Age is not valid
Name: 6mrk--Age:105
Name: Y17lcgB--Age:50
Name: 2sebRBkcpn2ijwje--Age:116
Name: QxtsMs9UO--Age:106
Age is not valid
Name: pjnI3h8E2HYSXNmCwo2f--Age:43
```
