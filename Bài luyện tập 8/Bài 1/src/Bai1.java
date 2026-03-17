import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {

    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm sinh viên theo tên");
            System.out.println("4. Xóa sinh viên theo MSSV");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();
            sc.nextLine(); // tránh lỗi nhập

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chọn sai!");
            }

        } while (choice != 0);
    }

    // 1. Thêm sinh viên
    static void addStudent() {
        System.out.print("Nhập MSSV: ");
        String mssv = sc.nextLine();

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine();

        list.add(new Student(mssv, name, gpa));
        System.out.println("✔ Đã thêm sinh viên!");
    }

    // 2. Hiển thị
    static void showStudents() {
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.println("\n=== DANH SÁCH ===");
        for (Student s : list) {
            System.out.println(s);
        }
    }

    // 3. Tìm theo tên
    static void searchStudent() {
        System.out.print("Nhập tên cần tìm: ");
        String keyword = sc.nextLine();

        boolean found = false;

        for (Student s : list) {
            if (s.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy!");
        }
    }

    // 4. Xóa theo MSSV
    static void deleteStudent() {
        System.out.print("Nhập MSSV cần xóa: ");
        String id = sc.nextLine();

        boolean removed = list.removeIf(s -> s.getMssv().equals(id));

        if (removed) {
            System.out.println("✔ Đã xóa!");
        } else {
            System.out.println("Không tìm thấy MSSV!");
        }
    }
}