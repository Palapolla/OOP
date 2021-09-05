package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        long fact = 1;
        for(int i = 1;i<= a;i++){
            fact = fact*i;
        }
    System.out.println(fact);
    }
}
