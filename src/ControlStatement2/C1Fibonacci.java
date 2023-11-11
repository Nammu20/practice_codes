package ControlStatement2;

public class C1Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int first = 0, second=1;
        for (int i = 1; i <= n; ++i) {
            System.out.println(first + " ");

            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }
}
