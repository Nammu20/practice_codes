
package ControlStatement2;

public class H20StarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {

            for (int j= 1; j<=7; j++) {
                if (j <= (2 * i) - 1) {
                    if (j - i <= 0) {
                        System.out.print(i - j + 1);
                    } else if (j - i >= 0) {
                        System.out.print(j - i + 1);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
