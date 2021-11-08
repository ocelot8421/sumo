package hu.progmasters.oop.methods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee smallEmployee = new Employee("John", "Small", 200000);
        Employee largeEmployee = new Employee("Lőrinc", "Pénztáros", 987654);

        System.out.println(smallEmployee.getMonthlySalary() * 12);
        System.out.println(smallEmployee.annualSalary());
        System.out.println(largeEmployee.annualSalary());

        smallEmployee.setMonthlySalary(smallEmployee.getMonthlySalary() * 1.1);
        largeEmployee.setMonthlySalary(largeEmployee.getMonthlySalary() * 1.1);

        System.out.println(smallEmployee.annualSalary() + " ffff");
        System.out.println(largeEmployee.annualSalary());
    }
}
