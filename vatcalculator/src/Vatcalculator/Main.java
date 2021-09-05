package Vatcalculator;

public class Main {

    public static void main(String[] args) {
	    float price = 300.00f;
	    float vat = 7.00f;
	    float total = (price*vat/100)+price;
	    System.out.println(total);
    }
}
