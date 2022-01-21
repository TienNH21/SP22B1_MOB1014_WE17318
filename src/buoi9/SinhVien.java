package buoi9;

public class SinhVien {
    // Thuộc tính
    // Tất cả các thuộc tính phải để private
    String hoTen; // default
    private String maSV;
    private String sdt;
    private String email;
    private String diaChi;
    private String chuyenNganh;
    private String queQuan;

    public SinhVien() {
        // Đây là hàm khởi tạo - constructor
        // Hàm khởi tạo phải cùng tên với class & KHÔNG có kiểu trả về
        // Hàm khởi tạo sẽ được gọi khi khởi tạo đối tượng
    }

    // Phương thức
    public void diHoc(String monHoc) {
        System.out.printf("%s Đi học %s\n", hoTen, monHoc);
    }
    
    public void diNgu() {
        System.out.println("Đi ngủ ...");
    }
    
    public void diChoi() {
        System.out.println("Đi chơi ...");
    }
    
    public boolean hocLaiHayKhong(double diem) {
        if (diem > 5) {
            System.out.println("Không học lại...");
            return false;
        } else {
            System.out.println("Học lại...");
            return true;
        }
    }
}
