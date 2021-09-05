package statement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String password = "ABAB";

	while(true)
    {
        Scanner scn = new Scanner(System.in);
        String inputpassword = scn.nextLine();
        if(password.equals(inputpassword))
        {
            System.out.println("Hello World");
            break;
        }
    }

    }
}
