package calculator;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int no = scn.nextInt();
        int[] total = new int[no];
        int i;
        int sum = 0;

        for(i = 0;i<(no);i++){
            total[i] = scn.nextInt();
            sum = sum +total[i];
        }
        System.out.println(sum+" THB");

    }
}
