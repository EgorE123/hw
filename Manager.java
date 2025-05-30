import java.util.Random;

public class Manager implements Employee {
    private Company company;
        Random random = new Random();
        private final int income = random.nextInt(140000 - 115000) + 115000;
        private int fixedSalary;

        public Manager(int fixedSalary, Company company) {
        this.fixedSalary = fixedSalary;
        this.company = company;
    }

    @Override
    public double getMonthSalary() {

        return fixedSalary + (double) income * 0.05;
    }

    @Override
    public String toString() {
        return "Менеджер: " + getMonthSalary();
    }
}