# Lưu Kho 

Trong quá trình làm, bạn có thể sẽ thấy rất nhiều nguồn source code khác nhau, để có thể sử dụng được repo người khác thì cần phải clone repo của họ về máy của mình, cách thực hiện rất đơn giản, đó là chọn fork.

Ví dụ:

<li>Vào trang github https://github.com/GroupKT/GroupK</li>
<li>Chon fork bên góc phải, github sẽ tự lưu repositories  này vào trong tài khoản github của bạn</li>


![gggc](https://user-images.githubusercontent.com/27818800/28244265-62c7e744-6a10-11e7-83ef-a8de2a6f6668.jpg)


# Gửi code và cùng Thực hiện một dự án
Để đóng góp cùng phát triển source code cho tôi thì mình cần thực hiện theo các bước sau:

Bước 1: Fork source code của họ như tôi đã nói trên

Bước 2: Clone project đã fork về máy tính của mình thông qua Github Desktop

Bước 3: Cập nhật và đồng bộ thông tin mới nhất từ repositories  gốc bằng lệnh


```sh
<br> git remote add upstream https://github.com/GroupKT/GroupK.git <br>
<br> git fetch upstream <br>
<br> git checkout master <br>
<br> git merge upstream/master <br>
```

Địa chỉ git bạn có thể copy từ mục Clone or Download

*Lưu ý*
*Luôn thực hiện thao tác này trước khi bạn commit code lên, mục đích là để trách xung đột với repositories gốc*

Bước 4: Commit và sync lên github

Hoặc bạn có thể đóng góp cho tôi tại [Vào đây](https://github.com/GroupKT/GroupK/issues)


Nhấn vào  để tải xuống mã nguồn [Vào đây](https://github.com/GroupKT/GroupK/archive/master.zip)
            <br> - Hoạc liên hệ: SĐT 0967846012<br>
            <br> - EMAIL: buithaotruong11@gmail.com<br>

# Cach Lấy Mã Nguồn Trên Java
Bươc 1: Mở phần mềm Neatbean vào team->git->clone

![vcvcvcd](https://user-images.githubusercontent.com/27818800/28245793-5cb880d4-6a38-11e7-9f22-ffddd8963754.png)

- Copy và dán địa chỉ kho cần lấy mả nguồn vào Repository URL

- Tiếp theo nhập thông tinh User và Password Github của mình

- Chọn đường dẫn để lưu dữ liệu Clone into 
Bước 2: Nhấn Next -> Tích chon vào nhánh muốn lấy mã nguồn 

![vcvcvx](https://user-images.githubusercontent.com/27818800/28245779-15e1c594-6a38-11e7-9f54-c56c59506ddf.png)

- Bạn có thể sữa lại nơi lưu và tên file nếu muốn -> Finish

![ccccvvvv](https://user-images.githubusercontent.com/27818800/28245804-91d88804-6a38-11e7-9727-72c4ce07f496.png)

# Đóng góp mã nguồn
Bước 1: Copy nhưng gì muốn đóng góp vào file vừa lấy xuống xuống.

Bước 2: Vào netbean.

Bước 3: Vào Favorites (Window -> Favorites)

Bước 4: Nếu muốn đóng gì vào project ở phần Favorites click phải chuột -> Chon Git -> Commit...
- Bạn có thể sửa và bổ sung mã nguồn ngay trên mã nguồn vừa lấy xuống ngay trong Favorites và thực hiện bắt đầu từ bước 4.

- Vậy là bạn đãn đóng góp xong mã nguồn của mình lên kho github.
