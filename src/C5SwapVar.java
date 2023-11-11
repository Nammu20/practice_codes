public class C5SwapVar {
    public static void main(String[] args) {
        //without using another var
        int a = 5;
        int b = 6;
//        a = a+b;
//        b = a-b;git
//        a = a-b;

        //with using another var
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of variables after swapping is: a = " + a + "and b = " + b);

    }

}