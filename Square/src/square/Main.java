package square;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n == 1) {
            System.out.println(" #");
            System.out.println("# #");
            System.out.println(" #");
        }
        else {
            for (int i = 0; i < n; i++) {
                System.out.print("#");
            }
            System.out.println();
            for (int k = 0; k < n - 2; k++) {
            System.out.print("#");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
            }
            for (int i = 0; i < n; i++) {
            System.out.print("#");
        }
    }
    }
}
