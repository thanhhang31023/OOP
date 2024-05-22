package quanLiStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        // Thêm vào danh sách hai học sinh mới
        studentManagement.addStudent(new Student("1", "Linh", 18, "Hn", 8.5, "12A"));
        studentManagement.addStudent(new Student("2", "Anh", 17, "HCM", 7.2, "11A"));

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Xem danh sách học sinh");
            System.out.println("2. Thêm học sinh mới");
            System.out.println("3. Cập nhập điểm học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Xem danh sách học sinh theo lớp");
            System.out.println("6. Sắp xếp theo tên");
            System.out.println("7. Sắp xếp theo tuổi");
            System.out.println("8. Sắp xếp theo điểm");
            System.out.println("9. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear buffer

            switch (choice) {
                case 1:
                    System.out.println("Danh sách học sinh:");
                    studentManagement.displayStudents();
                    break;
                case 2:
                    System.out.print("Nhập ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Clear buffer
                    System.out.print("Nhập địa chỉ: ");
                    String address = scanner.nextLine();
                    System.out.print("Nhập điểm: ");
                    double point = scanner.nextDouble();
                    scanner.nextLine();  // Clear buffer
                    System.out.print("Nhập lớp: ");
                    String classroom = scanner.nextLine();
                    studentManagement.addStudent(new Student(id, name, age, address, point, classroom));
                    System.out.println("Thêm học sinh mới thành công!");
                    break;
                case 3:
                    System.out.print("Nhập ID học sinh cần cập nhật điểm: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Nhập điểm mới: ");
                    double newPoint = scanner.nextDouble();
                    scanner.nextLine();  // Clear buffer
                    studentManagement.updatePoint(updateId, newPoint);
                    System.out.println("Cập nhật điểm thành công!");
                    break;
                case 4:
                    System.out.print("Nhập ID học sinh cần xóa: ");
                    String removeId = scanner.nextLine();
                    studentManagement.removeStudent(removeId);
                    System.out.println("Xóa học sinh thành công!");
                    break;
                case 5:
                    System.out.print("Nhập lớp cần xem: ");
                    String classToView = scanner.nextLine();
                    System.out.println("Danh sách học sinh trong lớp " + classToView + ":");
                    studentManagement.displayStudentsByClassroom(classToView);
                    break;
                case 6:
                    studentManagement.sortByName();
                    System.out.println("Danh sách học sinh sau khi sắp xếp theo tên:");
                    studentManagement.displayStudents();
                    break;
                case 7:
                    studentManagement.sortByAge();
                    System.out.println("Danh sách học sinh sau khi sắp xếp theo tuổi:");
                    studentManagement.displayStudents();
                    break;
                case 8:
                    studentManagement.sortByPoint();
                    System.out.println("Danh sách học sinh sau khi sắp xếp theo điểm:");
                    studentManagement.displayStudents();
                    break;
                case 9:
                    exit = true;
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}

