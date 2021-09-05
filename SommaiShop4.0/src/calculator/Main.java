package calculator;

import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    static Scanner scn;
    static int NoOfCustomer , i;
    static String[] Name, Gender;
    static int[] Birthyear;
    public static void main(String[] args) {
        Scanner scn = new Scanner();
        NoOfCustomer = scn.nextInt();
        for (i = 0; i < NoOfCustomer; i++) {
            name();
            birthyear();
            gender();
        }
    }
    private void name() {
        Name = new String[NoOfCustomer];
        Name[i] = scn.nextLine();
    }
    private void birthyear() {
        Birthyear = new int[NoOfCustomer];
        Birthyear[i] = scn.nextint();

    }
    private void  gender() {
        Gender = new String[NoOfCustomer];
        Gender[i] = scn.nextLine();
    }










}
