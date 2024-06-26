package quanLiNhanVien;

public class KiemChungVien extends NhanVien {
    private int soLoi;

    public KiemChungVien(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, double luongCoBan, int soLoi) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan);
        this.soLoi = soLoi;
    }

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }

    @Override
    public double tinhLuong() {
        return super.getLuongCoBan() + soLoi * 50000;
    }
}
