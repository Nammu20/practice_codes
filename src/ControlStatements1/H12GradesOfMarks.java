package ControlStatements1;

import java.util.Scanner;

public class H12GradesOfMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[]marks = new float[5];
        System.out.print(("Enter the marks of subject : "));

        //marks for each subject
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextFloat();
        }

        //sum of marks
        float sum = 0;
        for (float m: marks) {
            sum+=m;
        }

        //per of marks
        float percentage = ((sum/500)*100);

        String grade;
        if (percentage >= 90) {
            grade = "Grade A";
        } else if (percentage >= 80) {
            grade = "Grade B";
        } else if (percentage >= 70) {
            grade = "Grade C";
        } else if (percentage >= 60) {
            grade = "Grade D";
        } else if (percentage >= 40) {
            grade = "Grade E";
        } else {
            grade = "Grade F";
        }

        // Output the result
        System.out.println("Sum of marks: " + sum);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

    }
}
