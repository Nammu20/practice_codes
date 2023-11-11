package accessModifier;

import java.util.Scanner;

public class C2EmployeeDemo {
    protected int emp_id;
    public String emp_name;
    private double emp_salary;
    String emp_dept;

    public void doPublic() {
        System.out.println("This is the doPublic() method.");
        System.out.println("emp_id: " + emp_id);
        System.out.println("emp_name: " + emp_name);
        System.out.println("emp_salary: " + emp_salary);
        System.out.println("emp_dept: " + emp_dept);
    }

    void doDefault() {
        System.out.println("This is the doDefault() method.");
        System.out.println("emp_id: " + emp_id);
        System.out.println("emp_name: " + emp_name);
        System.out.println("emp_salary: " + emp_salary);
        System.out.println("emp_dept: " + emp_dept);
    }

    protected void doProtected() {
        System.out.println("This is the doProtected() method.");
        System.out.println("emp_id: " + emp_id);
        System.out.println("emp_name: " + emp_name);
        System.out.println("emp_salary: " + emp_salary);
        System.out.println("emp_dept: " + emp_dept);
    }

    private void doPrivate() {
        System.out.println("This is the doPrivate() method.");
        System.out.println("emp_id: " + emp_id);
        System.out.println("emp_name: " + emp_name);
        System.out.println("emp_salary: " + emp_salary);
        System.out.println("emp_dept: " + emp_dept);
    }

    public void enterData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter emp_id: ");
        emp_id = scanner.nextInt();
        System.out.print("Enter emp_name: ");
        emp_name = scanner.next();
        System.out.print("Enter emp_salary: ");
        emp_salary = scanner.nextDouble();
        System.out.print("Enter emp_dept: ");
        emp_dept = scanner.next();
    }

    public void displayData() {
        System.out.println("Employee Data:");
        System.out.println("emp_id: " + emp_id);
        System.out.println("emp_name: " + emp_name);
        System.out.println("emp_salary: " + emp_salary);
        System.out.println("emp_dept: " + emp_dept);
    }

    public static void main(String[] args) {
        C2EmployeeDemo employee = new C2EmployeeDemo();
        employee.enterData();
        employee.displayData();
        employee.doPublic();
        employee.doDefault();
        employee.doProtected();
        employee.doPrivate();
    }
}


