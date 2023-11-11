package JavaBasicQs;

import java.util.Scanner;

public class C5ConvertDays {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();

        int y = totalDays / 365;
        int remainingDays = totalDays % 365;
        int w = remainingDays / 7;
        int d = remainingDays % 7;

        System.out.println(y + " years, " + w + " weeks, " + d + " days");
    }
}
