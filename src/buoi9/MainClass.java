package buoi9;

public class MainClass {
    public static void main(String[] args) {
        /*
         * Sử dụng khuôn mẫu (class) để tạo ra đối tượng:
         * Sử dụng từ khóa new để tạo ra đối tượng mới
         * Đối tượng được tạo ra từ khuôn mẫu SinhVien thì sẽ có kiểu dữ liệu: SinhVien
         */
        SinhVien sv1 = new SinhVien("Ng Van A", "PH12345", "anvph12345@fpt.edu.vn", "0123123123", "TKTW");
        
        System.out.println(sv1.hoTen);
    }
}
