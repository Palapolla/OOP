package reverse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] split = s.split(" ");
        String result = "";
        for (int i = split.length - 1; i >= 0; i--) {
           System.out.print(split[i]+" ");

        }

    }
}
