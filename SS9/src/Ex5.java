abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Name: " + name + " | Salary: " + calculateSalary());
    }
}

class OfficeEmployee extends Employee {
    private double baseSalary;

    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

class ProductionEmployee extends Employee {
    private int products;
    private double pricePerProduct;

    public ProductionEmployee(String name, int products, double pricePerProduct) {
        super(name);
        this.products = products;
        this.pricePerProduct = pricePerProduct;
    }

    @Override
    public double calculateSalary() {
        return products * pricePerProduct;
    }
}

public class Ex5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new OfficeEmployee("Alice", 1000.0);
        employees[1] = new ProductionEmployee("Bob", 50, 20.0);
        employees[2] = new ProductionEmployee("Charlie", 60, 20.0);

        double totalSalary = 0;

        for (Employee emp : employees) {
            emp.displayInfo();
            totalSalary += emp.calculateSalary();
        }

        System.out.println("-----------------------------");
        System.out.println("Total Salary: " + totalSalary);
    }
}