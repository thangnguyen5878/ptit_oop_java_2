## ELAB2314 - Planet

### Đề bài

Cho sơ đồ lớp của một hành tinh như sau:

![400](https://i.imgur.com/8aNIKyo.png)


Theo thuyết Trái Đất và các hành tinh quay xung quanh mặt trời, khối lượng vật thể trên mỗi hành tinh sẽ khác nhau và phụ thuộc vào trọng lực bề mặt (Surface Gravity) của hành tinh đó.

$SurfaceGravity = MG/r^2$

trong đó M là khối lượng, r là bán kính và G là một hằng số

Ví dụ, trọng lực bề mặt của Mặt trăng là 1.62 $m/s^2$ , bằng 0.17 lần ở Trái đất, vì thế một vật trên Mặt trăng sẽ nhẹ hơn, chỉ bằng 0.17 lần ở Trái đất.

Định nghĩa lớp Hành Tinh như trong sơ đồ lớp ở trên, sau đó sử dụng lớp đã định nghĩa để tính khối lượng của một vật ở trên hành tinh đó.

### Dữ liệu vào

Dòng đầu tiên là tên hành tinh.

Dòng thứ hai là khối lượng.

Dòng thứ ba là bán kính.

Dòng thứ tư là khối lượng một vật trên Trái đất.

### Dữ liệu ra

In ra theo định dạng:

Your weight on __tên-hành-tinh___ is __khối-lượng___

ví dụ:

Your weight on MARS is 50.78

Khối lượng với độ chính xác hai chữ số

### Ví dụ

Input #1 
```
EARTH
5.976e+24
6.37814e6
40
```

Output #1 
```
Your weight on EARTH is 40.00
```
