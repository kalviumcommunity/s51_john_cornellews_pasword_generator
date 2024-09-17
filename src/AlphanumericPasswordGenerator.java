package src;

import java.util.Random;
import java.util.Scanner;

public class AlphanumericPasswordGenerator extends PasswordGenerator implements AutoCloseable {
    private Scanner inputAlpha;

    // Constructor to initialize the Scanner object
    public AlphanumericPasswordGenerator() {
        System.out.println("Alphanumeric Password Generator Initialized.");
        this.inputAlpha = new Scanner(System.in);
    }

    // Method to get length from the user
    public void getLengthFromUser() {
        System.out.println("Enter the length of the password:");
        try {
            int length = inputAlpha.nextInt();
            setLength(length);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }

    // Override close method to close the Scanner
    @Override
    public void close() {
        if (inputAlpha != null) {
            inputAlpha.close();
            inputAlpha = null; // Clear reference to allow garbage collection
            System.out.println("AlphanumericPasswordGenerator resources have been cleaned up.");
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
        return password.toString();
    }
}
