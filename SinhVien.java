 public class SinhVien {
    private String id;
    private String ten;
    private double diem;

    public SinhVien(String id, String ten, double diem) {
        this.id = id;
        this.ten = ten;
        this.diem = diem;
    }

    public String getid() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public double getDiem() {
        return diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSo='" + id + '\'' + ", ten='" + ten + '\'' + ", diem=" + diem + '}';
    }
}