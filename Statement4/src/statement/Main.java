package statement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    Scanner scn = new Scanner(System.in);
	    int userInput = scn.nextInt();
        switch (userInput)
        {
            case 1 :
                System.out.println("Hello World");
                break;
            case 2 :
                System.out.println("How are you?");
                break;
            case 3 :
                System.out.println("Good bye");
                break;
        }
    }
}
