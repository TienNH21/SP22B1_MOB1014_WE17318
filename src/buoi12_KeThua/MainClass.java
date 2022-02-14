package buoi12_KeThua;

public class MainClass {
    public static void main(String[] args) {
        SinhVien sv1 =
            new SinhVien("Ng Van A", "PH12345", "LTMT", 1);
        
        sv1.xuat();
        
        System.out.println("-----------------------");
        
        SinhVienWeb sv2 =
            new SinhVienWeb("Tran Thi B", "PH12356", 0);
        
        sv2.xuat();
    }
}
