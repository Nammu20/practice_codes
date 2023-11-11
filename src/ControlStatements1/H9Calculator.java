package ControlStatements1;

import java.util.Scanner;

public class H9Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        boolean isRunning = true;
        while(isRunning){
            System.out.println("Enter the num of operation you want to perform :");
            System.out.println("1 : Addition 2 : subtraction 3 : Multiplication  4 : Division  5 : exit");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Addition selected");
                    int add = num1 + num2;
                    System.out.println("Result : " + add);
                    break;
                case 2:
                    System.out.println("Subtraction selected");
                    int sub = num1 - num2;
                    System.out.println("Result : " + sub);
                    break;
                case 3:
                    System.out.println("Multiplication selected");
                    int mul = num1 * num2;
                    System.out.println("Result : " + mul);
                    break;
                case 4:
                    System.out.println("Division selected");
                    if(num2!=0){
                        int div = num1/num2;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                case 5:
                    System.out.println("Exit selected");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }

        System.out.println("Exiting the program... ");



    }
}
