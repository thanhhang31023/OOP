package quanLiNhanVien;

public class LapTrinhVien extends NhanVien {
    private int soGioOverTime;

    public LapTrinhVien(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, double luongCoBan, int soGioOverTime) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan);
        this.soGioOverTime = soGioOverTime;
    }

    public int getSoGioOverTime() {
        return soGioOverTime;
    }

    public void setSoGioOverTime(int soGioOverTime) {
        this.soGioOverTime = soGioOverTime;
    }

    @Override
    public double tinhLuong() {
        return super.getLuongCoBan() + soGioOverTime * 200000;
    }
}
