class Shape {
    public double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public double area(double scale) {
        return (Math.PI * radius * radius) * scale;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class Ex6 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Rectangle(3.0);

        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.area();
        }

        System.out.println("Total Area (Polymorphism): " + totalArea);

        Circle c = new Circle(5.0);
        System.out.println("Original Area: " + c.area());
        System.out.println("Scaled Area (Overloading): " + c.area(2.0));
    }
}