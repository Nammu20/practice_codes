package ControlStatements1;

import java.util.Scanner;

public class H5VowelConsonant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);  //converts a char to lowercase
        if(ch =='a' ||  ch =='e' || ch =='i'|| ch == 'o' || ch
            =='u'){
        System.out.println("Character is a vowel");
    }
        else{
        System.out.println("Character is a consonant");
    }


    }
}
