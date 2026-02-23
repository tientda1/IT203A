package Ex5;

public class Manager extends Employee implements BonusCalculator {
    private double bonusAmount;

    public Manager(String name, double baseSalary, double bonusAmount) {
        super(name, baseSalary);
        this.bonusAmount = bonusAmount;
    }

    @Override
    public double getBonus() {
        return bonusAmount;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }
}
