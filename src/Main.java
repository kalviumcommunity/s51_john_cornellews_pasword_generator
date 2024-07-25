package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter alpha for alpha numeric and special for special character based password");
        String choice = input.nextLine();
        System.out.println(choice);
        if (choice.equals("alpha")) {
            AlphanumericPasswordGenerator alphaGen = new AlphanumericPasswordGenerator();
            alphaGen.getLengthFromUser(); // Get length from user
            System.out.println("Alphanumeric Password: " + alphaGen.generatePassword());
        } else if (choice.equals("special")) {
            SpecialCharacterPasswordGenerator specialGen = new SpecialCharacterPasswordGenerator();
            specialGen.getLengthFromUser(); // Get length from user
            System.out.println("Special Character Password: " + specialGen.generatePassword());
        }

        input.close();
    }
}
