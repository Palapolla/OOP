package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int no = scn.nextInt();

        for(int No=2;No<no+2;No++)
        {
            for (int i = 0; i < No; i++) {
                for (int j = 0; j < (no - i); j++) {
                    System.out.print(" ");
                }
                for (int a = 0; a < (2 * i) + 1; a++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (int i = 0; i < no; i++)
        {
                System.out.print(" ");
        }
        System.out.println("|");
        for(int b = 0; b<no; b++)
        {
            System.out.print("=");
        }
        System.out.print("v");
        for(int b = 0; b<no; b++)
        {
            System.out.print("=");
        }
    }
}
