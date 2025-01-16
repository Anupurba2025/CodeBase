//INSTANCE VARIABLE

package Basics;

public class Employee {
    // This instance variable is shown to its child classes
    public String name;

    // This instance variable is visible in Employee class only
    private double salary;

    // This name variable is assigned in the constructor
    public Employee(String ename) {
        name = ename;
    }

    // This salary variable is assigned to a value
    public void setSalary(double esalary) {
        salary = esalary;
    }

    // It helps to print all the employee details
    public void printEmp() {
        System.out.println("Name of the employee is - " + name);
        System.out.println("Salary of the employee is - " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Anu");
        emp.setSalary(1000000);
        emp.printEmp();
    }
}
