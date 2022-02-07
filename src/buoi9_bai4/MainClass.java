package buoi9_bai4;

public class MainClass {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Ng Van A", "PH12311", 100, "PDT");
        NhanVien nv2 = new NhanVien("Ng Van B", "PH12312", 200, "CTSV");
        NhanVien nv3 = new NhanVien("Ng Van C", "PH12313", 300, "HC");
        
        nv1.xuat();
        nv2.xuat();
        nv3.xuat();
    }
}
