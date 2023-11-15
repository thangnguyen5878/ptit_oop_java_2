## BASIC007 - Constructor overloading

 Báo lỗi

### Đề bài

Tạo class Product, đại diện cho một sản phẩm trong một cửa hàng. Mỗi sản phẩm có tên, vị trí và trọng lượng.

Thêm ba hàm khởi tạo sau vào lớp Product:

1.`public Product(String name)`: tạo một sản phẩm với tên được cung cấp. Vị trí của nó được đặt là "shelf" và trọng lượng được đặt là 1.

2.`public Product(String name, String location)`: tạo một sản phẩm với tên và vị trí được cung cấp. Trọng lượng của nó được đặt là 1.

3.`public Product(String name, int weight)`: tạo một sản phẩm với tên và trọng lượng được cung cấp. Vị trí của nó được đặt là "shelf".

  

Có thể test với code như sau

```
Product tapeMeasure = new Product("Tape measure");Product plaster = new Product("Plaster", "home improvement section");Product tyre = new Product("Tyre", 5);System.out.println(tapeMeasure.toString());System.out.println(plaster.toString());System.out.println(tyre.toString());
```

### Dữ liệu vào

Không yêu cầu dữ liệu vào

### Dữ liệu ra

Sử dụng

```
Product tapeMeasure = new Product("Tape measure");Product plaster = new Product("Plaster", "home improvement section");Product tyre = new Product("Tyre", 5);System.out.println(tapeMeasure.toString());System.out.println(plaster.toString());System.out.println(tyre.toString());
```

để test code đầu ra

### Ví dụ

Input #1 

<empty>

Output #1 

Tape measure (1kg) can be found from the shelf
Plaster (1kg) can be found from the home improvement section
Tyre (5kg) can be found from the shelf