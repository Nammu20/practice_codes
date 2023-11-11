package access.modifier2;

import accessModifier.C2EmployeeDemo;

public class C2EmployeeDemo2 {
    public static void main(String[] args) {


        C2EmployeeDemo employee = new C2EmployeeDemo();
       // employee.emp_id = 123; // Not accessible due to protected access modifier
        employee.emp_name = "John"; // Accessible due to public access modifier
        //employee.emp_salary = 5000.0; // Not accessible due to private access modifier
        //employee.emp_dept = "IT"; // Not accessible due to default access modifier

        // Uncomment the lines below to test accessing methods from a different package and class
        employee.doPublic(); // Accessible due to public access modifier
        //employee.doDefault(); // Not accessible due to default access modifier
        //employee.doProtected(); // Not accessible due to protected access modifier
        //employee.doPrivate(); // Not accessible due to private access modifier

        // Uncomment the line below to test displaying data from a different package and class
        employee.displayData();

        // Uncomment the lines below to test accessing variables and methods from a different package and class

    }


}
