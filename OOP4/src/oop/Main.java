package oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculation cal1 = new Calculation();
        double a = cal1.addition(3,2);
        System.out.println(a);
        double b = cal1.subtraction(10,5);
        System.out.println(b);
        NewCalculation cal2 = new NewCalculation();
        double c = cal2.addition(3,2);
        double d = cal2.subtraction(3,2);
        double e = cal2.multiplication(3,2);
        double f = cal2.division(3,2);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
