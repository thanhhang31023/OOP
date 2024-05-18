package quanLiHocSInh;

public class HocSinh {
    private int id;
    private String ten;
    private int tuoi;
    private String diaChi;
    private double diem;
    private String lop;

    public HocSinh(int id, String ten, int tuoi, String diaChi, double diem, String lop) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.diem = diem;
        this.lop = lop;
    }

    // Getters và Setters
    public int layID() {
        return id;
    }

    public String layTen() {
        return ten;
    }

    public int layTuoi() {
        return tuoi;
    }

    public String layDiaChi() {
        return diaChi;
    }

    public double layDiem() {
        return diem;
    }

    public String layLop() {
        return lop;
    }

    public void datDiem(double diem) {
        this.diem = diem;
    }
}

