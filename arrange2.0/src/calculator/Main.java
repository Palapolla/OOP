package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int no = scn.nextInt();
        int[] a = new int[no];
        for(int i = 0;i<no;i++){
            a[i] = scn.nextInt();
        }
        for(int i = no-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
