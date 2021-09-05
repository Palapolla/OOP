package sommaishop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        String surname = scn.nextLine();
        String address = scn.nextLine();
        String gender = scn.nextLine();
        int tel = scn.nextInt();
        System.out.println("--- Customer Detail ---");
        System.out.println("Name : "+name+" "+surname);
        System.out.println("Address : "+address);
        System.out.println("Gender : "+gender);
        System.out.println("Tel : "+tel);
    }
}
