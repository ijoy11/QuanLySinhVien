import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Quản Lý Sinh Viên ---");
            System.out.println("1. Thêm Sinh Viên");
            System.out.println("2. Xóa Sinh Viên");
            System.out.println("3. Hiển Thị Danh Sách");
            System.out.println("4. Tìm Sinh Viên Theo Tên");
            System.out.println("5. Sắp Xếp Sinh Viên Theo Điểm");
            System.out.println("6. Kiểm Tra Sinh Viên Tồn Tại");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");

            int luaChon = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (luaChon) {
                    case 1:
                        System.out.print("Nhập mã số: ");
                        String maSo = scanner.nextLine();
                        System.out.print("Nhập tên: ");
                        String ten = scanner.nextLine();
                        System.out.print("Nhập điểm: ");
                        double diem = scanner.nextDouble();
                        qlsv.themSinhVien(maSo, ten, diem);
                        System.out.println("Thêm sinh viên thành công.");
                        break;
                    case 2:
                        System.out.print("Nhập mã số sinh viên cần xóa: ");
                        maSo = scanner.nextLine();
                        qlsv.xoaSinhVien(maSo);
                        System.out.println("Xóa sinh viên thành công.");
                        break;
                    case 3:
                        qlsv.hienThiDanhSach();
                        break;
                    case 4:
                        System.out.print("Nhập tên sinh viên cần tìm: ");
                        ten = scanner.nextLine();
                        qlsv.timSinhVienTheoTen(ten);
                        break;
                    case 5:
                        qlsv.sapXepSinhVienTheoDiem();
                        break;
                    case 6:
                        System.out.print("Nhập mã số sinh viên cần kiểm tra: ");
                        maSo = scanner.nextLine();
                        boolean tonTai = qlsv.kiemTraSinhVienTonTai(maSo);
                        System.out.println("Sinh viên tồn tại: " + tonTai);
                        break;
                    case 7:
                        System.out.println("Thoát chương trình");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
}