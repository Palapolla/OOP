package statement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFoodType = scanner.nextLine();

        if(inputFoodType.equals("Thai"))
        {
            String inputFlavor = scanner.nextLine();
            if(inputFlavor.equals("Spicy"))
            {
                System.out.println("Tomyum");
            }
            else if(inputFlavor.equals("Salty"))
            {
                System.out.println("Fried pork");
            }
            else
            {
                System.out.println("Pad Thai");
            }
        }
        else if(inputFoodType.equals("American"))
        {
            String inputFlavor = scanner.nextLine();
            if(inputFlavor.equals("Salty"))
            {
                System.out.println("French Fries");
            }
            else
            {
                System.out.println("Hamburger");
            }

        }

    }
}
