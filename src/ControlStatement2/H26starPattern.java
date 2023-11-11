package ControlStatement2;

public class H26starPattern {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {

            for (int j= 1; j<=9; j++) {
                    if (j+i == 6 || (j+i == 8 && i != 1) || j-i == 4 || (j-i == 2 && i !=
                            1)) {
                        System.out.print("*");
                    }
                    else if(i == 5 && i+j == 10){
                        System.out.print("*");
                    }
                    else {
                        System.out.print("_");
                    }
                }
            System.out.println();
        }
    }
}
