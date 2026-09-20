public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Rahul", "Patil", 30000);
        Employee employee2 = new Employee("Amit", "Sharma", 40000);

        // Display yearly salary
        double yearlySalary1 = employee1.getMonthlySalary() * 12;
        double yearlySalary2 = employee2.getMonthlySalary() * 12;

        System.out.println("Employee 1: "
                + employee1.getFirstName() + " "
                + employee1.getLastName());

        System.out.println("Yearly Salary: " + yearlySalary1);

        System.out.println();

        System.out.println("Employee 2: "
                + employee2.getFirstName() + " "
                + employee2.getLastName());

        System.out.println("Yearly Salary: " + yearlySalary2);

        // Give 10% raise
        employee1.setMonthlySalary(
                employee1.getMonthlySalary() * 1.10
        );

        employee2.setMonthlySalary(
                employee2.getMonthlySalary() * 1.10
        );

        // Display salary after raise
        System.out.println();
        System.out.println("After 10% Raise:");

        yearlySalary1 = employee1.getMonthlySalary() * 12;
        yearlySalary2 = employee2.getMonthlySalary() * 12;

        System.out.println("Employee 1 Yearly Salary: " + yearlySalary1);
        System.out.println("Employee 2 Yearly Salary: " + yearlySalary2);
    }
}