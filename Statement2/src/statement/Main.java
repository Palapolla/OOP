package statement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        if(money >= 200)
        {
            System.out.println("Kraprao + Cola + Snack");
        }
        else if(money >= 100)
        {
            System.out.println("Kraprao + Cola");
        }
        else if(money >= 50)
        {
            System.out.println("Kraprao");
        }
        else if(money >= 0)
        {
            System.out.println("-");
        }
    }
}
