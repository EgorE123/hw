// TODO 1. Создайте класс компании Company, содержащей сотрудников и реализующей методы:
//•	найм одного сотрудника — hire(Employee employee),
//•	найм списка сотрудников – hireAll(Collection<Employee> employes),
//•	увольнение сотрудника – fire(Employee employee),
//•	получение значения дохода компании – getIncome().
//Каждый метод НЕ должен иметь модификатор static,
// это позволит каждому объекту класса Company иметь свой набора сотрудников, свой расчет дохода,
// увольнение и найм.
// Аргументы и возвращаемое значение методов выберите на основании логики работы вашего приложения.
//
//2. Создайте два метода, возвращающие список указанной длины (count).
// Они должны содержать сотрудников, отсортированных по убыванию и возрастанию заработной платы:
//•	List<Employee> getTopSalaryStaff(int count),
//•	List<Employee> getLowestSalaryStaff(int count).

//3. Создайте классы сотрудников с информацией о зарплатах и условиями начисления зарплаты:
//•	Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег.
// Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей.
//•	TopManager — зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы,
// если доход компании более 10 млн рублей.
//•	Operator — зарплата складывается только из фиксированной части.
//Каждый класс сотрудника должен имплементировать интерфейс Employee.
// В интерфейсе Employee должен быть объявлен метод, возвращающий зарплату сотрудника, — getMonthSalary().
//Аргументы и возвращаемое значение метода выберите в соответствии с логикой начисления зарплат.
// В интерфейсе объявите необходимые методы.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

public class Company {

    private double income;
    List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {

        employees.add(employee);
    }

    public void hireAll(Collection<Employee> employees) {

        employees.addAll(employees);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public double getIncome() {

        return income;
    }

    public void setIncome(double income) {

        this.income = income;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count <= 0 || count > employees.size()) {
            return new ArrayList<>();
        } else {
            List<Employee> sorted = new ArrayList<>(employees);
            sorted.sort(Comparator.comparingDouble(Employee::getMonthSalary).reversed());
            return sorted.subList(0, count);
        }
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count <= 0 || count > employees.size()) {
            return new ArrayList<>();
        } else {
            List<Employee> sorted = new ArrayList<>(employees);
            sorted.sort(Comparator.comparingDouble(Employee::getMonthSalary));
            return sorted.subList(0, count);
        }
    }
}
