## ELAB2308 - Class Car

### Đề bài

Cho biểu đồ lớp như sau:

![](https://i.imgur.com/JJHEb6d.png)



a. Hãy định nghĩa các lớp trong biểu đồ cùng hàm khởi tạo đầy đủ tham số.

Phương thức calculateSalePrice() được sử dụng để tính giá lăn bánh của một chiếc xe như sau:

- Với ClassicCar, giá lăn bánh được nhân với hệ số 1.12 do thêm phí trước bạ 12% ở Hà Nội, phí ra biển số là 20 triệu VND.
- Với SportCar, nếu xe sản xuất sau năm 2018, giá lăn bánh giảm 20%; nếu xe sản xuất sau năm 2010, giá giảm 50%; trong các trường hợp còn lại giá giảm 90%

b. Sử dụng một thành viên tĩnh của lớp Car để xác định giá lăn bánh cao nhất của tất cả các đối tượng xe.

### Dữ liệu vào

Dòng đầu tiên là số testcase.

Những dòng tiếp theo, mỗi dòng là dữ liệu của một đối tượng xe theo định dạng:

[Loại xe] [Giá] [Năm sản xuất]

Trong đó:

- [Loại xe] có thể là SC (SportCar) hoặc CC (ClassicCar).
- [Giá] là giá cơ bản của xe.
- [Năm sản xuất] từ năm 1886 (khi chiếc xe Mercedes-Benz đầu tiên được công nhận là ô tô) đến nay.

### Dữ liệu ra

- Tương ứng với mỗi dòng dữ liệu, khởi tạo một đối tượng xe tương ứng và sử dụng phương thức toString() để in ra giá lăn bánh theo định dạng:

Price: ____ VND | Year: ____

- Dòng cuối cùng in ra giá lăn bánh cao nhất nêu trên đề bài theo định dạng:

Most Expensive:____ VND

  

Ví dụ:  

Price: 500,000,000 VND | Year: 2019

Most Expensive: 100,000,000,000 VND

**Note: Định dạng giá có dấu , sau mỗi ba số 0; độ chính xác 2 chữ số**

### Ví dụ

Input #1 
```
2
SC 2000000000 2015
CC 10000000 1890
```


Output #1 
```
Price: 1,000,000,000.00 VND | Year: 2015
Price: 31,200,000.00 VND | Year: 1890
Most Expensive: 1,000,000,000.00 VND
```
D