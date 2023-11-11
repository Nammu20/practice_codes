package JavaBasicQs;

public class C6CompoundInterest {
    public static void main(String[] args) {
        int p = 1000,n = 4,t = 3;
        double r = 5/100;
        double base = (1+(r/n));
        double exponent = (n*t);
        double A = p*Math.pow(base,exponent);
        System.out.println("Compound Interest is = " +A);
    }
}
