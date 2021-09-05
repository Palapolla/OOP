package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = 1;
        int i = 0;
        while(i<b)
        {
            c = c*a;
            i++;
        }
        System.out.print(c);

    }
}