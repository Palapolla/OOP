package fish;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner weight = new Scanner(System.in);
    Scanner minormax = new Scanner(System.in);
    int p=0;
    int temp;
    int a[] = new int[p];

        while(true)
        {
            int n=0;
            p++;
            a[n] = weight.nextInt();
            System.out.println("n"+n);
            System.out.println("p"+p);
            System.out.println(a[n]);

            if(a[n]==0)
                {
                    weight.close();
                }

             n++;

        }
         String mm = minormax.nextLine();
                    if((mm.equals("Min"))||(mm.equals("min")))
                    {
                        for (int n = 0; n < p; n++)
                        {
                            for (int j = n + 1; j < p; j++) {
                                if (a[n] > a[j])
                                {
                                    temp = a[n];
                                    a[n] = a[j];
                                    a[j] = temp;
                                }
                            }
                        }
                        for (int i = 0; i < p - 1; i++)
                        {
                            System.out.print(a[n] + ", ");
                        }
                        System.out.print(a[p - 1]);
                    }
                }


    }

