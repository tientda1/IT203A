package btth;

public class Shape {
    protected String tenHinh;

    public Shape(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public double tinhChuVi() {
        return 0;
    }

    public double tinhDienTich() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%-10s | Chu vi: %-6.2f | Diện tích: %-6.2f",
                tenHinh, tinhChuVi(), tinhDienTich());
    }
}