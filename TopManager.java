class TopManager implements Employee {
    private double fixedSalary;
    private Company company;

    public TopManager(double fixedSalary, Company company) {
        this.fixedSalary = fixedSalary;
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        double salary = fixedSalary;
        if (company.getIncome() > 10_000_000) {
            salary += fixedSalary * 1.5;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "Топ Менеджер: " + getMonthSalary();
    }
}