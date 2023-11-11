package ControlStatement2;

public class H18StarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <=17; i++) {
            for (int j = 1; j <=9; j++) {
                    if( i%2!=0 && j-i <= 0 && i+j<=18){
                    System.out.print("*");
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println();
            }
    }
}
