package buoi9;

public class MainClass {
    public static void main(String[] args) {
        /*
         * Sử dụng khuôn mẫu (class) để tạo ra đối tượng:
         * Sử dụng từ khóa new để tạo ra đối tượng mới
         * Đối tượng được tạo ra từ khuôn mẫu SinhVien thì sẽ có kiểu dữ liệu: SinhVien
         */
        SinhVien sv1 = new SinhVien();
        sv1.hoTen = "Dũng";
        sv1.diChoi(); // Thực hiện lời gọi hàm diChoi() trên đối tượng sv1
        sv1.diNgu(); // Thực hiện lời gọi hàm diNgu() trên đối tượng sv1
        sv1.hocLaiHayKhong(4);
        
        SinhVien sv2 = new SinhVien();
    }
}
