public class Operator implements Employee {
    private double fixedSalary;

    public Operator(double fixedSalary, Company company) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getMonthSalary() {
        return fixedSalary;
    }

    @Override
    public String toString() {
        return "Оператор: " + getMonthSalary();
    }
}