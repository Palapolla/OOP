package statement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		String inputpassword;
    	String password = "1234";
		do
		{
        	Scanner scn = new Scanner(System.in);
        	inputpassword = scn.nextLine();
		}
		while(!password.equals(inputpassword));
	    	System.out.println("Hello World");
    }
}
