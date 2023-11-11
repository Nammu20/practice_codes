package ControlStatements1;

import java.util.Scanner;

public class C3GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Basic Salary : ");
        double BS = sc.nextDouble();
        double HRA = 0,DA=0;
        if(BS <=10000){
            HRA = BS*0.20;
            DA = BS*0.80;
        }
        else if(BS <=20000){
             HRA = BS*0.25;
             DA = BS*0.90;
        }
        else if(BS >20000){
             HRA = BS*0.3;
             DA = BS*0.95;
        }
        else{
            System.out.println("invalid input");
        }
        double GS = (BS+HRA+DA);
        System.out.println("Gross Salary: " + GS);


    }
}
