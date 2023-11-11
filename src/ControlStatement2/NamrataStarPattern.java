package ControlStatement2;

public class NamrataStarPattern {
    public static void main(String[] args) {
        //print N :
        int n = 5; // height of the letter N

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print(" ");

            //Print A
            for (int j = 1; j <= n; j++) {
                if (j + i == 4 || j - i == 2 || i == 3 || (j == 1 && j + i >= 4) || (j == 5 && j - i < 3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            //print M

            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || (i == j && i+j != 8) || (i==2 && i+j !=5) )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }


        //print R

            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || (j == 5 && i+j != 9) || (i == 3 && i+j!=5)  || (i == 4 && j == 3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }


//
        //print A
            for (int j = 1; j <= n; j++) {
                if (j+ i == 4 || j-i == 2 || i == 3 || (j == 1 && j+i >=4)||( j == 5 && j-i <3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }


        //print T

            for (int j = 1; j <= n; j++) {
                if ( i == 1 || j == 3 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }


        //print A

            for (int j = 1; j <= n; j++) {
                if (j+ i == 4 || j-i == 2 || i == 3 || (j == 1 && j+i >=4)||( j == 5 && j-i <3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}



