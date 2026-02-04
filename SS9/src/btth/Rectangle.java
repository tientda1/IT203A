package btth;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double dai, double rong) {
        super("Rectangle");
        this.height = dai;
        this.width = rong;
    }

    @Override
    public double tinhChuVi() {
        return (height + width) * 2;
    }

    @Override
    public double tinhDienTich() {
        return height * width;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | (Dài: %.1f, Rộng: %.1f)", height, width);
    }
}
