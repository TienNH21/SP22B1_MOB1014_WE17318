package buoi12_KeThua.lab7_1;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public double getChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }
    
    public double getDienTich() {
        return this.chieuDai * this.chieuRong;
    }
    
    public void xuat() {
        System.out.println(
            this.chieuDai + " - " +
            this.chieuRong + " - " +
            this.getChuVi() + " - " +
            this.getDienTich()
        );
    }
}
