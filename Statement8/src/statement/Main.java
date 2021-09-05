package statement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String username = "Admin";
	String password = "nimdA";
		Scanner scn = new Scanner(System.in);
	String usernameinput = scn.nextLine();
	String passwordinput = scn.nextLine();
	if((username.equals(usernameinput))&&(password.equals(passwordinput)))
	{
	    System.out.println("HelloWorld");
    }
    }
}
