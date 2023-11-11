package ControlStatements1;

import java.util.Scanner;

public class H10NumOrChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) {
            System.out.printf("The character '%c' is an alphabet.%n", ch);
        } else if (Character.isDigit(ch)) {
            System.out.printf("The character '%c' is a number.%n", ch);
        } else {
            System.out.printf("The character '%c' is a special character.%n", ch);
        }
        //printf is used to display the result of character type checking in a formatted manner.
        // The placeholders %c and %n are used to represent the character and a newline, respectively.
    }
}
