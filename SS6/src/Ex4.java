import java.math.BigDecimal;

class Employee {
    private String id;
    private String name;
    private BigDecimal salary;

    // --- CÁC CONSTRUCTOR ---


    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(String id, String name, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }




    public void displayInfo() {
        System.out.println("---------------------------------");
        System.out.println("Mã NV   : " + this.id);
        System.out.println("Tên NV  : " + this.name);
        System.out.println("Lương   : " + this.salary + " $");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("E001", "John Doe");
        Employee e3 = new Employee("E002", )
    }
}