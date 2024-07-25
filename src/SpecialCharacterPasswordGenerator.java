package src;

import java.util.Scanner;

public class SpecialCharacterPasswordGenerator extends PasswordGenerator {
    public void getLengthFromUser() {
        System.out.println("Enter the length of the password");
        Scanner input = new Scanner(System.in);
        try {
            int length = input.nextInt();
            setLength(length);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }

    @Override
    public String generatePassword() {
        int l = getLength();
        System.out.println(l + " length");
        return "working fine special character";
    }
}
