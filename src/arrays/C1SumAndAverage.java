package arrays;

public class C1SumAndAverage {
    public static void main(String[] args) {
        int[]arr = {1,5,6,7,9};
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }

        int avg = sum/arr.length;
        System.out.print("Sum is : " +sum + " Avg is : " +avg);
    }
}
