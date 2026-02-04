package btth;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        super("Circle");
        this.r = r;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * r;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | (R: %.1f)", r);
    }
}
