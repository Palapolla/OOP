package Gradecalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int grade = scn.nextInt();
        if(grade>100){
            System.out.println("Error : Value must be less than or equal to 100.");
        }
        else if(grade<0){
            System.out.println("Error : Value must be greater than or equal to 0.");
        }
        else if (grade >= 90) {
            System.out.println("A");
        }
        else if (grade >= 85) {
            System.out.println("B+");
        }
        else if (grade >= 80) {
            System.out.println("B");
        }
        else if (grade >= 75) {
            System.out.println("C+");
        }
        else if (grade >= 70) {
            System.out.println("C");
        }
        else if (grade >= 65) {
            System.out.println("D+");
        }
        else if (grade >= 60) {
            System.out.println("D");
        }
        else if (grade < 60) {
            System.out.println("F");
        }
    }
}



