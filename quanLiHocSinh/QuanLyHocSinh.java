package quanLiHocSInh;

import java.util.ArrayList;

public class QuanLyHocSinh {
    private ArrayList<HocSinh> hocSinhs;

    public QuanLyHocSinh() {
        this.hocSinhs = new ArrayList<>();
    }

    public void themHocSinh(HocSinh hocSinh) {
        hocSinhs.add(hocSinh);
    }

    public void capNhatDiem(int id, double diemMoi) {
        for (HocSinh hocSinh : hocSinhs) {
            if (hocSinh.layID() == id) {
                hocSinh.datDiem(diemMoi);
                System.out.println("Điểm của học sinh đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh có ID " + id);
    }

    public void xoaHocSinh(int id) {
        for (int i = 0; i < hocSinhs.size(); i++) {
            if (hocSinhs.get(i).layID() == id) {
                hocSinhs.remove(i);
                System.out.println("Học sinh đã được xóa.");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh có ID " + id);
    }

    public void hienThiDanhSachHocSinh() {
        if (hocSinhs.isEmpty()) {
            System.out.println("Danh sách học sinh trống.");
            return;
        }
        System.out.println("Danh sách học sinh:");
        for (HocSinh hocSinh : hocSinhs) {
            System.out.println(hocSinh.layID() + " - " + hocSinh.layTen() + " - " + hocSinh.layTuoi() + " tuổi - " +
                    hocSinh.layDiaChi() + " - " + hocSinh.layDiem() + " điểm - " + hocSinh.layLop());
        }
    }

    public void hienThiHocSinhTheoLop(String lop) {
        System.out.println("Danh sách học sinh lớp " + lop + ":");
        boolean timThay = false;
        for (HocSinh hocSinh : hocSinhs) {
            if (hocSinh.layLop().equals(lop)) {
                timThay = true;
                System.out.println(hocSinh.layID() + " - " + hocSinh.layTen() + " - " + hocSinh.layTuoi() + " tuổi - " +
                        hocSinh.layDiaChi() + " - " + hocSinh.layDiem() + " điểm");
            }
        }
        if (!timThay) {
            System.out.println("Không có học sinh nào trong lớp " + lop);
        }
    }

    public void sapXepHocSinh(khaNangSapXep sapXep) {
        sapXep.sapXep(hocSinhs);
        System.out.println("Danh sách học sinh đã được sắp xếp.");
    }
}
