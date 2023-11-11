package ControlStatements1;

import java.util.Scanner;

public class C4ElecBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of units : ");
        int unit = sc.nextInt();
        double BillTotal = 0;


        if(unit<=50){
            BillTotal = (0.50*unit);
        }
        else if(unit<=150){
            BillTotal= 50*0.50+((unit-50)*0.75);
        }
        else if(unit<=250){
            BillTotal= 50*0.5+100*0.75+((unit-150)*1.20);
        }else{
            BillTotal= 50*0.5+100*0.75+100*1.20+((unit-250)*1.50);
        }

        double Surcharge = (BillTotal*0.20);
        BillTotal+=Surcharge;

        System.out.println("Total Electricity Bill : Rs. " +BillTotal);


        }
    }
