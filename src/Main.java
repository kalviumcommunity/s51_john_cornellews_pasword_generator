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
            AlphanumericPasswordGenerator alphaGen[] = new AlphanumericPasswordGenerator[num];
            for(int i =0; i < num; i++){
                alphaGen[i] = new AlphanumericPasswordGenerator();
                alphaGen[i].getLengthFromUser();
                alphaGen[i].generatePassword();
            }
        } 
        else if (choice.equals("special")) {
            SpecialCharacterPasswordGenerator specialGen[] = new SpecialCharacterPasswordGenerator[num];
            for(int i =0; i < num; i++){
                specialGen[i] = new SpecialCharacterPasswordGenerator();
                specialGen[i].getLengthFromUser();
                specialGen[i].generatePassword();
                }
        }
        input.close();
    }
}
