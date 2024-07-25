package src;

import java.util.Scanner;


public class AlphanumericPasswordGenerator extends PasswordGenerator {
    public void getLengthFromUser() {
        System.out.println("Enter the length of the password");
        Scanner inputAlpha = new Scanner(System.in);
        try {
            int length = inputAlpha.nextInt();
            setLength(length);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }

    @Override
    public String generatePassword() {
        int l = getLength();
        System.out.println(l + " length");
        return "working fine alpha numeric";
    }
}
