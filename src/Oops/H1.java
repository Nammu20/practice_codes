package Oops;

class Bonus{
    int year;

    int salary;

    double totalSalary;

    public void setYear(int year) {
        this.year = year;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void moreThan5(){
        totalSalary = salary + (0.35 * salary);
    }
    public void lessThan5(){
        totalSalary = salary + (0.15 * salary);
    }

    public double getTotalSalary(){
        return totalSalary;
    }

}
public class H1 {
    public static void main(String[] args) {
        Bonus emp1 = new Bonus();
        emp1.setYear(6);
        emp1.setSalary(50000);
        emp1.moreThan5();
        System.out.println("Total Salary : " + emp1.getTotalSalary());

        Bonus emp2 = new Bonus();
        emp2.setYear(3);
        emp2.setSalary(30000);
        emp2.lessThan5();
        System.out.println("Total Salary : " + emp2.getTotalSalary());

    }
}
