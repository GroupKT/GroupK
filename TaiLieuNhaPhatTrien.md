## Tài Liệu Cho Nhà Phát Triển

###Project thiết kế theo mô hình 3 lớp:
- Lớp giao diện
- Lớp xử lý logic
- Lớp thao tác với CSDL

### Lớp Giao Diện: thiết kế giao diện của phần mềm
![gui_menu](https://user-images.githubusercontent.com/27764596/28246778-1564a924-6a4c-11e7-8693-3e03af8ed8da.png)

![gui_book](https://user-images.githubusercontent.com/27764596/28246781-1c838478-6a4c-11e7-8263-cf813afd8afa.png)

### Lớp Xử Lý Logic: Đây là layer xử lý chính các dữ liệu trước khi được đưa lên hiển thị trên màn hình hoặc xử lý các dữ liệu trước khi chuyển xuống Data Access Layer để lưu dữ liệu xuống cơ sở dữ liệu.


### Lớp Thao Tác Với CSDL: Lớp này thực hiện các nghiệp vụ liên quan đến lưu trữ và truy xuất dữ liệu của ứng dụng như đọc, lưu, cập nhật cơ sở dữ liệu.
#
|public static void InsertKhachHang(KhachHang kh) {
        String sql = "insert into KHACH_HANG values(?,?,?,?,?)";
        try {
            ps = DBconnect.getConnect().prepareStatement(sql);
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getTenKH());
            ps.setDate(3, kh.getBirth());
            ps.setString(4, kh.getDiaChi());
            ps.setString(5, kh.getPhone());
          
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm khách hàng thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Khách hàng không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateKhachHang(KhachHang kh) {
        try {
            ps = DBconnect.getConnect().prepareStatement("UPDATE KHACH_HANG SET  Ten_Khach_hang = ?,"
                    + "Ngay_sinh = ?, Dia_chi = ?, Phone = ? where Ma_Khach_hang = ?");
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getTenKH());
            ps.setDate(3, kh.getBirth());
            ps.setString(4, kh.getDiaChi());
            ps.setString(5, kh.getPhone());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean DeleteKhachHang(String maKH) {
        try {
            ps = DBconnect.getConnect().prepareStatement("DELETE FROM KHACH_HANG WHERE Ma_Khach_hang = ?");
            ps.setString(1, maKH);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }|
