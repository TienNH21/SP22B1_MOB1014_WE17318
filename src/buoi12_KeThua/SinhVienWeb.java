package buoi12_KeThua;

public class SinhVienWeb extends SinhVien {

    public SinhVienWeb() {
        this.setChuyenNganh("TKTW");
    }

    public SinhVienWeb(
        String hoTen,
        String maSV,
        int gioiTinh
    ) {
        // Gọi hàm khởi tạo của lớp cha
        super(hoTen, maSV, "TKTW", gioiTinh);
    }
    
    public void xuat() {
        System.out.println("Thiết kế trang web - BE");
        super.xuat();
    }
}
