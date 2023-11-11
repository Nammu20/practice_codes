package Oops;

/*class AdditionDemo{
    int instanceVarNo1;
    int instanceVarNo2;
    int instanceVarResult;


    public AdditionDemo(int num1, int num2){
        instanceVarNo1 = num1;
        instanceVarNo2 = num2;
    }
    public int addition(){
        instanceVarResult = instanceVarNo1 + instanceVarNo2;
        return instanceVarResult;
    }
    public int subtraction(){
        instanceVarResult = instanceVarNo1 - instanceVarNo2;
        return instanceVarResult;
    }
    public int multiplication(){
        instanceVarResult = instanceVarNo1 * instanceVarNo2;
        return instanceVarResult;
    }
    public int division(){
        if(instanceVarNo2 != 0){
            instanceVarResult = instanceVarNo1 / instanceVarNo2;
            return instanceVarResult;
        }
        else{
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }

    }
}

public class C2 {
    public static void main(String[] args) {
        AdditionDemo obj1 = new AdditionDemo(2,4);
        int result1 = obj1.addition();
        System.out.println(result1);

        AdditionDemo obj2 = new AdditionDemo(5,2);
        int result2 = obj2.subtraction();
        System.out.println(result2);

        AdditionDemo obj3 = new AdditionDemo(5,2);
        int result3 = obj3.multiplication();
        System.out.println(result3);

        AdditionDemo obj4 = new AdditionDemo(4,2);
        int result4 = obj4.division();
        System.out.println(result4);
    }
}*/

//variation 2

class AdditionDemo{
    private int number1;
    private int number2;
    private int result;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void addition() {
        result = number1 + number2;
    }

    public void subtraction() {
        result = number1 - number2;
    }

    public void multiplication() {
        result = number1 * number2;
    }

    public void division() {
        if (number2 != 0) {
            result = number1 / number2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public int getResult() {
        return result;
    }
}

public class C2 {
    public static void main(String[] args) {
        AdditionDemo demo1 = new AdditionDemo();
        demo1.setNumber1(10);
        demo1.setNumber2(5);
        demo1.addition();
        System.out.println("Addition Result: " + demo1.getResult());

        AdditionDemo demo2 = new AdditionDemo();
        demo2.setNumber1(20);
        demo2.setNumber2(8);
        demo2.subtraction();
        System.out.println("Subtraction Result: " + demo2.getResult());

        AdditionDemo demo3 = new AdditionDemo();
        demo3.setNumber1(6);
        demo3.setNumber2(3);
        demo3.multiplication();
        System.out.println("Multiplication Result: " + demo3.getResult());

        AdditionDemo demo4 = new AdditionDemo();
        demo4.setNumber1(15);
        demo4.setNumber2(0);
        demo4.division();
        System.out.println("Division Result: " + demo4.getResult());
    }
}
