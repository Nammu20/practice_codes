package JavaBasicQs;

public class H7TotalAvg
{
    public static void main(String[] args)
    {
        int[]arr = {50,67,78,89,91,84};
        int n = 6;
        float sum =0f;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        float avg = (sum/n);
        System.out.println(avg);
    }
}
