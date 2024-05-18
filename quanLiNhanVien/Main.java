package quanLiNhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng nhân viên lập trình viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        LapTrinhVien[] lapTrinhViens = new LapTrinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên lập trình viên thứ " + (i + 1) + ":");
            System.out.print("Mã nhân viên: ");
            String maNhanVien = scanner.nextLine();
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Tuổi: ");
            int tuoi = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Số điện thoại: ");
            String soDienThoai = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Lương cơ bản: ");
            double luongCoBan = scanner.nextDouble();
            System.out.print("Số giờ overtime: ");
            int soGioOverTime = scanner.nextInt();
            scanner.nextLine();

            lapTrinhViens[i] = new LapTrinhVien(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan, soGioOverTime);
        }

        System.out.println("\nNhập số lượng nhân viên kiểm chứng viên: ");
        n = scanner.nextInt();
        scanner.nextLine();

        KiemChungVien[] kiemChungViens = new KiemChungVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên kiểm chứng viên thứ " + (i + 1) + ":");
            System.out.print("Mã nhân viên: ");
            String maNhanVien = scanner.nextLine();
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Tuổi: ");
            int tuoi = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Số điện thoại: ");
            String soDienThoai = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Lương cơ bản: ");
            double luongCoBan = scanner.nextDouble();
            System.out.print("Số lỗi phát hiện: ");
            int soLoi = scanner.nextInt();
            scanner.nextLine();

            kiemChungViens[i] = new KiemChungVien(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan, soLoi);
        }

        System.out.println("\nThông tin các nhân viên lập trình viên:");
        for (LapTrinhVien lapTrinhVien : lapTrinhViens) {
            lapTrinhVien.inThongTin();
            System.out.println("Lương: " + lapTrinhVien.tinhLuong());
            System.out.println();
        }

        System.out.println("\nThông tin các nhân viên kiểm chứng viên:");
        for (KiemChungVien kiemChungVien : kiemChungViens) {
            kiemChungVien.inThongTin();
            System.out.println("Lương: " + kiemChungVien.tinhLuong());
            System.out.println();
        }
    } }