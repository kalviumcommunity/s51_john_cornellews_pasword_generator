package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'alpha' for alphanumeric password or 'special' for special character based password:");
        String choice = input.nextLine();

        if (!choice.equals("alpha") && !choice.equals("special")) {
            System.out.println("Invalid choice");
            input.close();
            return;
        }

        System.out.print("Enter the number of passwords you intend to generate: ");
        int num = input.nextInt();

        if (choice.equals("alpha")) {
            AlphanumericPasswordGenerator[] alphaGen = new AlphanumericPasswordGenerator[num];
            for (int i = 0; i < num; i++) {
                alphaGen[i] = new AlphanumericPasswordGenerator();
                alphaGen[i].getLengthFromUser();
                System.out.println(alphaGen[i].generatePassword());
            }
            for (int i = 0; i < num; i++) {
                alphaGen[i].close(); // Clean up resources
                alphaGen[i] = null;
            }
        } else if (choice.equals("special")) {
            SpecialCharacterPasswordGenerator[] specialGen = new SpecialCharacterPasswordGenerator[num];
            for (int i = 0; i < num; i++) {
                specialGen[i] = new SpecialCharacterPasswordGenerator();
                specialGen[i].getLengthFromUser();
                System.out.println(specialGen[i].generatePassword());
            }
            for (int i = 0; i < num; i++) {
                specialGen[i].close();
                specialGen[i] = null;
            }
        }

        input.close();
    }
}
