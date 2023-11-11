package ControlStatements1;

import java.util.Scanner;

public class H6UCaseLCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        char ch = sc.next().charAt(0);
        if(ch >='A' && ch <= 'Z'){
            System.out.println("Alphabet is Uppercase");
        }
        else if(ch >='a' && ch <= 'z'){
            System.out.println("Alphabet is lowercase");
        }
        else{
            System.out.println("ch is not an alphabet");
        }

    }
}
