package quanLiHocSInh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyHocSinh quanLy = new QuanLyHocSinh();
        HocSinh hocSinh1 = new HocSinh(1, "Nguyễn Văn A", 15, "Hà Nội", 8.5, "ChuyenToan");
        HocSinh hocSinh2 = new HocSinh(2, "Trần Thị B", 16, "Hồ Chí Minh", 7.8, "ChuyenToan");
        HocSinh hocSinh3 = new HocSinh(3, "Tạ Thi Linh", 17, "Hà Nội", 8.7, "ChuyenTin");
        HocSinh hocSinh4 = new HocSinh(4, "Nguyễn Tuấn Anh", 18, "Hồ Chí Minh", 9.8, "ChuyenTin");

            // Thêm học sinh vào danh sách
            quanLy.themHocSinh(hocSinh1);
            quanLy.themHocSinh(hocSinh2);
            quanLy.themHocSinh(hocSinh3);
            quanLy.themHocSinh(hocSinh4);

            Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Xem danh sách học sinh");
            System.out.println("2. Thêm học sinh mới");
            System.out.println("3. Cập nhật điểm học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Xem danh sách học sinh theo lớp");
            System.out.println("6. Sắp xếp theo tên");
            System.out.println("7. Sắp xếp theo tuổi");
            System.out.println("8. Sắp xếp theo điểm");
            System.out.println("9. Thoát");
            System.out.print("Chọn chức năng: ");

            int luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    quanLy.hienThiDanhSachHocSinh();
                    break;
                case 2:
                    System.out.print("Nhập mã số: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = scanner.nextLine();
                    System.out.print("Nhập điểm: ");
                    double diem = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Nhập lớp: ");
                    String lop = scanner.nextLine();
                    quanLy.themHocSinh(new HocSinh(id, ten, tuoi, diaChi, diem, lop));
                    System.out.println("Học sinh đã được thêm vào danh sách.");
                    break;
                case 3:
                    System.out.print("Nhập mã số của học sinh cần cập nhật điểm: ");
                    int idCapNhat = scanner.nextInt();
                    System.out.print("Nhập điểm mới: ");
                    double diemMoi = scanner.nextDouble();
                    quanLy.capNhatDiem(idCapNhat, diemMoi);
                    break;
                case 4:
                    System.out.print("Nhập mã số của học sinh cần xóa: ");
                    int idXoa = scanner.nextInt();
                    quanLy.xoaHocSinh(idXoa);
                    break;
                case 5:
                    System.out.print("Nhập lớp cần xem danh sách học sinh: ");
                    String lopCanXem = scanner.next();
                    quanLy.hienThiHocSinhTheoLop(lopCanXem);
                    break;
                case 6:
                    quanLy.sapXepHocSinh(new khaNangSapXep() {
                        @Override
                        public void sapXep(ArrayList<HocSinh> hocSinhs) {

                        }
                    });
                    quanLy.hienThiDanhSachHocSinh();
                    break;
                case 7:
                    quanLy.sapXepHocSinh(new khaNangSapXep() {
                        @Override
                        public void sapXep(ArrayList<HocSinh> hocSinhs) {

                        }
                    });
                    quanLy.hienThiDanhSachHocSinh();
                    break;
                case 8:
                    quanLy.sapXepHocSinh(new khaNangSapXep() {
                        @Override
                        public void sapXep(ArrayList<HocSinh> hocSinhs) {

                        }
                    });
                    quanLy.hienThiDanhSachHocSinh();
                    break;
                case 9:
                    System.out.println("Đã thoát chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
