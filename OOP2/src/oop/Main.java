package oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println(helloworld());
	System.out.println(name());
    }
    private static String helloworld(){
        return "hello world";
    }
    private static String name(){
        Scanner scn = new Scanner(System.in);
        String Name = scn.nextLine();
        return Name;
    }
}
