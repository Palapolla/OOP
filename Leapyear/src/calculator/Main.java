package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if((a%4)==0)
        {
            if((a%400)==0)
            {
                System.out.print("Leap Year");
            }
            else if((a%100)==0)
            {
                System.out.print("์Not a Leap Year");
            }
        }
        else
        {
            System.out.print("์Not a Leap Year");
        }

    }
}