package currencyexchange;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your money in US$ : ");
	    double money = scanner.nextDouble();
	    System.out.println("you money is " +money*31.47 + " ฿");

    }
}
