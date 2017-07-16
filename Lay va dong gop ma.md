# Lưu Kho của người khác 

Trong quá trình làm, bạn có thể sẽ thấy rất nhiều nguồn source code khác nhau, để mình có thể sử dụng được repo người khác thì cần phải clone repo của họ về máy của mình, cách thực hiện rất đơn giản, đó là chọn fork

Ví dụ mình muốn fork thư viện DHT của Adafruit thì:

<li>Vào trang github https://github.com/adafruit/DHT-sensor-library</li>
<li>Chon fork bên góc phải, github sẽ tự lưu repo này vào trong tài khoản github của chúng ta</li>


![gggc](https://user-images.githubusercontent.com/27818800/28244265-62c7e744-6a10-11e7-83ef-a8de2a6f6668.jpg)


# Gửi code và cùng Thực hiện một dự án
Để đóng góp cùng phát triển source code cho ai đó (mình lấy ví dụ ở đây với thư viện DHT của Adafruit) thì mình cần thực hiện theo các bước sau:

Bước 1: Fork source code của họ như mình đã nói trên

Bước 2: Clone project đã fork về máy tính của mình thông qua Github Desktop

Bước 3: Cập nhật và đồng bộ thông tin mới nhất từ repo gốc bằng lệnh

git remote add upstream https://github.com/xxxx.git
git fetch upstream
git checkout master
git merge upstream/master
Ví dụ mình muốn cập nhật mới nhất từ thư viện DHT thì mình sẽ thay chỗ xxx.git bằng

git remote add upstream https://github.com/adafruit/DHT-sensor-library.git
Địa chỉ git bạn có thể copy từ mục Clone or Download
![g3](https://user-images.githubusercontent.com/27818800/28244289-21005c14-6a11-11e7-96d5-9c8b75fe1c32.jpg)

*Lưu ý*
*Luôn thực hiện thao tác này trước khi bạn commit code lên, mục đích là để trách xung đột với repo gốc*
Bước 3: Chỉnh sửa và tối ưu code, ví dụ như thêm các chức năng vào thư viện

Bước 4: Commit và sync lên github, lúc này những thay đổi của mình chỉ được cập nhật lên tài khoản github của cá nhân, chưa có sự thay đổi trên repo gốc (Adafruit)

Bước 5: Thực hiện pull request lên thư mục gốc, chờ chủ repo thảo luận, sau khi thấy hợp tình hợp lý thì họ sẽ merge code cũng như bổ sung các tính năng mới cập nhật của bạn vào code, đồng thời đưa bạn vào danh sách contributors luôn.

![g4](https://user-images.githubusercontent.com/27818800/28244301-9b3d8128-6a11-11e7-8f66-f1f750c9021b.jpg)

Coi như một số bước cơ bản làm quen đã xong, nếu các bạn muốn tìm hiểu sâu hơn có thể xem thêm hướng dẫn từ github https://guides.github.com/


# Lấy Mã Nguồn Trên Java
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
