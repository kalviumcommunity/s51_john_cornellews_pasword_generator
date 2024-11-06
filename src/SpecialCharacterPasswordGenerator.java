package src;

import java.util.Random;
import java.util.Scanner;

public class SpecialCharacterPasswordGenerator extends PasswordGenerator implements AutoCloseable {
    private Scanner input;

    // Constructor to initialize the Scanner object
    public SpecialCharacterPasswordGenerator() {
        System.out.println("Special Character Password Generator Initialized.");
        this.input = new Scanner(System.in);
    }

    // Override close method to close the Scanner
    @Override
    public void close() {
        if (input != null) {
            input.close();
            input = null; // Clear reference to allow garbage collection
            System.out.println("SpecialCharacterPasswordGenerator resources have been cleaned up.");
        }
    }

    @Override
    public String generatePassword() {
        int length = getLength();
        if (length <= 0) {
            return "Password length must be greater than 0.";
        }

        // Define the character pool (alphanumeric + special characters)
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Generate the password using random characters
        for (int i = 0; i < length; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }
        return password.toString();
    }
}
