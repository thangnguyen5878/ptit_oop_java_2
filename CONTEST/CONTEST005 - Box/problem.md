
## CONTEST005 - Chiếc hộp

 Báo lỗi

### Đề bài

**Bài có 4 tasks**

![](https://i.imgur.com/d1e79zt.png)
  
**

**Task 1**: Tạo class`Item`bao gồm các thông tin sau (1 điểm)

- name: String
- weight: int

Hãy viết các constructor tương ứng nhận 2 tham số (name, weight) và với 1 tham số (name). Hãy viết các hàm getters (accessors) tương ứng của class`Item`trên

  

**Task 2:**Tạo abstract class`Box`bao gồm 2 methods abstract sau (2 điểm)

- add(Item item): Thêm 1 item vào danh sách box hiện có
- isInBox(Item item): Kiểm tra xem item có tồn tại trong danh sách items đã thêm vào box hay chưa

  

**Task 3**: Tạo class`BoxWithMaxWeight`thừa kế class`Box`bao gồm (4 điểm)

**Thuộc tính**

- items: ArrayListItem> - chứa danh sách items được thêm vào Box

**Phương thức**

- BoxWithMaxWeight(int maxWeight) : Tham số weight này xác định khối lượng tối đa (maxWeight) mà Box chứa được.
- Với hàm `add(Item item)` được code: Nếu như khối lượng item được thêm có khối lượng lớn hơn weight tối đa của Box thì sẽ không thêm vào được nữa, còn lại thêm vào Box bình thường
- Với hàm `isInBox(Item item)` được code: Kiểm tra nếu như item có tồn tại trong Box hay chưa, item chỉ tồn tại trong Box nếu như tên của Item có trong danh sách tên của Items trong Box hiện có

  

**Task 4**: Code hàm main() (3 điểm)

- Khởi tạo constructor BoxWithMaxWeight() với weight tối đa chứa được là 10
- Thêm các items vào BoxWithMaxWeight, sử dụng hàm tương ứng đã được định nghĩa ở trên, thêm các Item có thông số sau

|Tên|Khối lượng|
|---|---|
|Saludo|5|
|Pirkka|5|
|Kopi Luwak|5|

- Sử dụng hàm tương ứng của BoxWithMaxWeight, kiểm tra xem các items sau có trong Box hay không, chú ý khối lượng (weight) tối đa mà Box chứa được

|Tên|
|---|
|Saludo|
|Pirkka|
|Kopi Luwak|

### Dữ liệu vào

- Không có dữ liệu vào

### Dữ liệu ra

- Mỗi dòng in ra chỉ định xem Item có trong box hay không, trả về kết quả true / false

### Ví dụ

Input #1 

Không có input mẫu

Output #1 
```
true|false
true|false
true|false
```
