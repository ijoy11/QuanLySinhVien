import java.util.*;

public class QuanLySinhVien {
    private ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
    private HashSet<String> maSoSinhVien = new HashSet<>();

    public void themSinhVien(String maSo, String ten, double diem) {
        if (maSoSinhVien.contains(maSo)) {
            throw new IllegalArgumentException("Sinh viên với mã số " + maSo + " đã tồn tại.");
        }
        SinhVien sinhVien = new SinhVien(maSo, ten, diem);
        danhSachSinhVien.add(sinhVien);
        maSoSinhVien.add(maSo);
    }

    public void xoaSinhVien(String maSo) {
        boolean timThay = false;
        Iterator<SinhVien> iterator = danhSachSinhVien.iterator();
        while (iterator.hasNext()) {
            SinhVien sinhVien = iterator.next();
            if (sinhVien.getid().equals(maSo)) {
                iterator.remove();
                maSoSinhVien.remove(maSo);
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            throw new NoSuchElementException("Sinh viên với mã số " + maSo + " không tìm thấy.");
        }
    }

    public void hienThiDanhSach() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        for (SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien);
        }
    }

    public void timSinhVienTheoTen(String ten) {
        boolean timThay = false;
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getTen().equalsIgnoreCase(ten)) {
                System.out.println(sinhVien);
                timThay = true;
            }
        }
        if (!timThay) {
            throw new NoSuchElementException("Không tìm thấy sinh viên với tên " + ten + ".");
        }
    }

    public void sapXepSinhVienTheoDiem() {
        if (danhSachSinhVien.isEmpty()) {
            throw new IllegalStateException("Không có sinh viên để sắp xếp.");
        }
        danhSachSinhVien.sort(Comparator.comparingDouble(SinhVien::getDiem));
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:");
        hienThiDanhSach();
    }

    public boolean kiemTraSinhVienTonTai(String maSo) {
        return maSoSinhVien.contains(maSo);
    }
}