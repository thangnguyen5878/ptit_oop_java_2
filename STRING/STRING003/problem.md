## STRING003 - Kiểm tra chuỗi có bằng chuỗi khác hay không

### Đề bài

Cho hai chuỗi `s1` và `s2`, hãy viết chương trình kiểm tra xem chuỗi `s1` có giống chuỗi `s2` hay không, tính cả trường hợp viết hoa viết thường là giống nhau

Ví dụ:  

Dữ liệu vào: `s1=The Occasional languages were long.`.`s2=the occasional languages were long.`

Dữ liệu ra: `true`

Dữ liệu vào: `s1=The tonal churchgoers were Indefinite.``s2=churchgoers`

Dữ liệu ra: `false`

### Dữ liệu vào

Dòng 1 là chuỗi `s1`

Dòng 2 là chuỗi `s2`

### Dữ liệu ra

- Mỗi dòng chứa 1 kết quả của dữ liệu sau khi đã kiểm tra xem chuỗi s1 có giống chuỗi s2 hay không

### Ví dụ

Input #1 
```
10
The fundamental conversations were sudden.
deasdasdkasdasd
The proximate men were legal.
the proximate men were legal.
The representative soldiers were sophisticated.
deasdasdkasdasd
The such fields were influential.
the such fields were influential.
The small eyes were white.
deasdasdkasdasd
The heavy companies were fragile.
the heavy companies were fragile.
The democratic elections were worshipful.
the democratic elections were worshipful.
The such commitments were new.
deasdasdkasdasd
The inner factors were explicit.
deasdasdkasdasd
The Jewish institutions were fine.
the jewish institutions were fine.
```


Output #1 
```
false
true
false
true
false
true
true
false
false
true
```
