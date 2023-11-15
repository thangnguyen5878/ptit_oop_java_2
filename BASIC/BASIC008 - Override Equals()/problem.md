## BASIC008 - Override equals()

 Báo lỗi

### Đề bài

Tạo class`SimpleDate`như sau bao gồm 3 thuộc tính:`day`,`month`,`year`

Hãy override hàm`equals()`trong class`SimpleDate`để kiểm tra xem 2 ngày`SimpleDate`có giống nhau hay không sử dụng template sau. Hai ngày`SimpleDate`được coi là giống nhau khi`day`,`month`và`year`của chúng giống nhau

`@Override`

`publicbooleanequals (Objectobj) {   `

`// Code to be implemented to check equals`

`}`

### Dữ liệu vào

Đề bài không có dữ liệu vào

### Dữ liệu ra

Kiểm tra dữ liệu ra với trường hợp sau

```
SimpleDate d = new SimpleDate(1, 2, 2000);System.out.println(d.equals("heh"));System.out.println(d.equals(new SimpleDate(5, 2, 2012)));System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
```

### Ví dụ

Input #1 

<empty>

Output #1 

false
false
true