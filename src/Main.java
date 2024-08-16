package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter alpha for alpha numeric and special for special character based password");
        String choice = input.nextLine();
        System.out.println(choice);
        if(!choice.equals("alpha") && !choice.equals("special")){
            System.out.println("Invalid choice");
            input.close();
            return;
        }
        System.out.print("Enter the number of passwords you intend to generate: ");
        int num = input.nextInt();
         if (choice.equals("alpha")) { 
            // usage of new keyword to use dynamic memory management
            AlphanumericPasswordGenerator alphaGen[] = new AlphanumericPasswordGenerator[num];
            for(int i =0; i < num; i++){
                // usage of new keyword to use dynamic memory management
                alphaGen[i] = new AlphanumericPasswordGenerator();
                alphaGen[i].getLengthFromUser();
                System.out.println(alphaGen[i].generatePassword());
            }
            // eligible for automatic garbage collection
            alphaGen = null;
        } 
        else if (choice.equals("special")) {
            // usage of new keyword to use dynamic memory management
            SpecialCharacterPasswordGenerator specialGen[] = new SpecialCharacterPasswordGenerator[num];
            for(int i =0; i < num; i++){
                // usage of new keyword to use dynamic memory management
                specialGen[i] = new SpecialCharacterPasswordGenerator();
                specialGen[i].getLengthFromUser();
                System.out.println(specialGen[i].generatePassword());
                }
        // eligible for automatic garbage collection
            specialGen = null;
        }
        input.close();
    }
}
