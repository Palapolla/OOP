package gpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float thai = scn.nextFloat();
        float math = scn.nextFloat();
        float eng = scn.nextFloat();
        float sci = scn.nextFloat();
        float pe = scn.nextFloat();
        float gpa = (thai+math+eng+sci+pe)/5;
        System.out.println("THAI = "+thai);
        System.out.println("MATH = "+math);
        System.out.println("ENGLISH = "+eng);
        System.out.println("SCIENCE = "+sci);
        System.out.println("SPORT = "+pe);
        System.out.println("- - -");
        System.out.println("GPA = "+gpa);
    }
}
