## CONTEST001 - Interface practice


### Đề bài

Tạo ra interface

```java
interface Packable {
    double weight();}
```

Code 2 classes: Book và CD

- Book: có constructor với các thuộc tính: author(String), name(String), weight(double)
- CD: có constructor với các thuộc tính : artist(String), name(String), publicationYear(int)

Weight của CD là 0.1kg

Các class Book và CD phải xử lí interface`Packable`  

Viết class khởi tạo tương ứng, hàm`main()`để in ra thông tin như sau, chú ý implement method`toString()`của class

![](https://i.imgur.com/mF1gZQG.png)




Với 3 dòng đầu tiên của Book, 3 dòng tiếp theo của CD, tên đầu tiên ứng với trường đầu tiên của Book và Artist ở trên.

### Dữ liệu vào

- Đề bài không có dữ liệu vào

### Dữ liệu ra

- Viết code OOP để in ra dòng này

  ![](https://i.imgur.com/tJCRktG.png)



### Ví dụ

Input #1 

<trống>

Output #1 
```
Fyodor Dostoevsky: Crime and Punishment
Robert Martin: Clean Code
Kent Beck: Test Driven Development
Pink Floyd: Dark Side of the Moon (1973)
Wigwam: Nuclear Nightclub (1975)
Rendezvous Park: Closer to Being Here (2012)
```
