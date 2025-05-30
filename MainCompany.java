import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class MainCompany {
    public static void main(String[] args) {
        Company company = new Company();
        Manager manager = new Manager(85000, company);
        TopManager topManager = new TopManager(150000, company);
        Operator operator = new Operator(70000, company);

        company.setIncome(11000000);


        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Прибыль компании: " + df.format(company.getIncome()));

        company.hire(operator);
        company.hire(manager);
        company.hire(topManager);

        company.fire(operator);

        for (int i = 0; i < 180; i++) {
            Employee newOperator = new Operator(70000, company);
            company.hire(newOperator);
        }
        for (int i = 0; i < 80; i++) {
            Employee newManager = new Manager(85000, company);
            company.hire(newManager);
        }
        for (int i = 0; i < 10; i++) {
            Employee newTopManager = new TopManager(150000, company);
            company.hire(newTopManager);
        }



        System.out.println("15 зарплат по убыванию: ");
        for (Employee employee : company.getTopSalaryStaff(15)) {
            System.out.println(employee);
        }
        System.out.println("30 зарплат по возрастанию: ");
        for (Employee employee : company.getLowestSalaryStaff(30)) {
            System.out.println(employee);
        }

    }
}
