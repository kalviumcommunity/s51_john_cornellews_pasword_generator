
// AlphanumericPasswordGenerator.java
package src;

import java.util.Random;
import java.util.Scanner;

public class AlphanumericPasswordGenerator extends PasswordGenerator {
    static Scanner inputAlpha;
    // Method to get length from the user
    public void getLengthFromUser() {
        System.out.println("Enter the length of the password:");
        inputAlpha = new Scanner(System.in);
        try {
            int length = inputAlpha.nextInt();
            setLength(length);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }

    // Method to close the Scanner instance
    static void closeInput() {
        if (inputAlpha != null) {
            inputAlpha.close();
        }
    }

    @Override
    public String generatePassword() {
        int length = getLength();
        if (length <= 0) {
            return "Password length must be greater than 0.";
        }
        // Define the character pool (alphanumeric)
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Generate the password using random characters
        for (int i = 0; i < length; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }
        // eligible for automatic garbage collection
        random = null;
        return password.toString();
    }
}