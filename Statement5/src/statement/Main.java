package statement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 0;

        while(i<n)
        {
            i++;
            int a = 0;
            while(a<i)
            {
                System.out.print("*");
                a++;
            }
            System.out.println();
        }
    }
}
