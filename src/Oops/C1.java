package Oops;


class MyClass{
    //data members
    int myNumber;
    String myName;

    //constructor : is used to initialize the data members
    public MyClass(int myNo, String name){
        myNumber = myNo;
        myName = name;
    }

    //member function
    public void display(){
        System.out.println("Number :" +myNumber);
        System.out.println("Name :" +myName);
    }
}

public class C1 {
    public static void main(String[] args) {
        //object is created
        MyClass obj = new MyClass(20,"Namrata");
        //access the data members and functions using the object
        obj.display();
    }
}
