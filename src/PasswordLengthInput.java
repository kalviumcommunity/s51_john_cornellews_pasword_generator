package src;

import java.util.Scanner;

public class PasswordLengthInput {
    private Scanner scanner;

    public PasswordLengthInput() {
        this.scanner = new Scanner(System.in);
    }

    public int getPasswordLength() {
        System.out.println("Enter the length of the password:");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
            return -1; // Return -1 for invalid input
        }
    }

    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
