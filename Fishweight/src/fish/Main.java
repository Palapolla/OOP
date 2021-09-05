package fish;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);
        int i = 0; //จำนวนข้อมูล
        int n=0;//กำหนดลำดับของข้อมูล
        while(true) {
            i++; //จำนวนข้อมูลจาก 0 เพิ่มมาเป็น 1
            int fishweight[] = new int[i]; //สร้าง array
            fishweight[n] = weight.nextInt();
            System.out.println(fishweight[n]);
            System.out.println("order(n) : "+n);

            if (n>2){
                System.out.println("test " +fishweight[1]);
            }
            n++;



        }

    }
}
