package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] num = new int[n];
        for(int i = 0;i<n;i++) {
            num[i] = scn.nextInt();
            num[i] = num[i]*(-1);
        }
        Arrays.sort(num);
        for(int i = 0;i<n;i++){
            num[i] = num[i]*(-1);
        }
        for(int i=0;i<num.length;i++) {
            System.out.print(num[i] + " ");
        }
    }
}
