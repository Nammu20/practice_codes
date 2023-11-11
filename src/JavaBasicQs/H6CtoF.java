package JavaBasicQs;

public class H6CtoF {
    public static void main(String[] args) {
        //c to f
        float C = 32f;
        float F = 32f+((9f*C)/5f);
        System.out.println(C + " Celsius = " +F + " Fahrenheit");

        //f to c
        float feh = 100.2f;
        float Cel = (((feh - 32f) * 5f) / 9f);
        System.out.println(feh + " Fahrenheit = " + Cel +" Celsius");
    }
}
