## STRING006 - Đảo chuỗi trong từ

### Đề bài
Đưa vào một chuỗi có chỉ mục bắt đầu từ 0 là `word` và một ký tự `ch`, đảo ngược đoạn của chuỗi bắt đầu từ chỉ mục 0 và kết thúc tại chỉ mục đầu tiên của ký tự `ch` (bao gồm cả ký tự `ch`). Nếu ký tự `ch` không tồn tại trong `word`, thì không làm gì cả.

Ví dụ, nếu `word = "abcdefd"` và `ch = "d"`, thì bạn nên đảo ngược đoạn bắt đầu từ 0 và kết thúc tại 3 (bao gồm cả 3). Chuỗi kết quả sẽ là "dcbaefd". Trả về chuỗi kết quả.

**Ví dụ:**
**Ví dụ 1:**
Đầu vào: word = "abcdefd", ch = "d"
Đầu ra: "dcbaefd"
Giải thích: Sự xuất hiện đầu tiên của "d" là tại chỉ mục 3.
Đảo ngược phần của chuỗi từ 0 đến 3 (bao gồm cả 3), chuỗi kết quả là "dcbaefd".

**Ví dụ 2:**
Đầu vào: word = "xyxzxe", ch = "z"
Đầu ra: "zxyxxe"
Giải thích: Sự xuất hiện duy nhất của "z" là tại chỉ mục 3.
Đảo ngược phần của chuỗi từ 0 đến 3 (bao gồm cả 3), chuỗi kết quả là "zxyxxe".

**Ví dụ 3:**
Đầu vào: word = "abcd", ch = "z"
Đầu ra: "abcd"
Giải thích: "z" không tồn tại trong word.
Không thực hiện bất kỳ phép đảo ngược nào, chuỗi kết quả là "abcd".
### Dữ liệu vào
- 1 <= độ dài của chuỗi word <= 250
- word bao gồm các ký tự tiếng Anh thường.
- ch là một ký tự tiếng Anh thường.
### Dữ liệu ra
- Mỗi dòng tương ứng với một test case sau khi đảo chuỗi
### Ví dụ
Input #1 
```
10
Ssa3 b
z4MEJ00OG4Kb a
Db6dS b
sYoJbRwl0O0 a
MrLtsz M
lHrEJ J
yTFRwsSdwBB d
5pd6gI a
LKxa b
DDxni x
```

Output #1 
```
Ssa3
z4MEJ00OG4Kb
bD6dS
sYoJbRwl0O0
MrLtsz
JErHl
dSswRFTywBB
5pd6gI
LKxa
xDDni
```