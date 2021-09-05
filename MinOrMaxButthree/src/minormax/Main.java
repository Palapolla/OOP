package minormax;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if((a>b)&&(a>c))
        {
            System.out.println("MAX : "+a);
        }
        else if((b>a)&&(b>c))
        {
            System.out.println("MAX : "+b);
        }
        else if((c>a)&&(c>b))
        {
            System.out.println("MAX : "+c);
        }
        else if(a==b)
        {
            System.out.println("MAX : "+a);
        }
    }
}
