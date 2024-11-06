package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object for user input

        // Ask for the type of password generator
        System.out.println("Enter 'alpha' for alphanumeric password or 'special' for special character based password:");
        String choice = input.nextLine();

        // Validate the choice input
        if (!choice.equals("alpha") && !choice.equals("special")) {
            System.out.println("Invalid choice. Exiting.");
            input.close();  // Close the scanner if invalid input
            return;
        }

        // Ask for the number of passwords to generate
        System.out.print("Enter the number of passwords you intend to generate: ");
        int num = input.nextInt();
        
        // Handle case where user might input a non-positive number
        if (num <= 0) {
            System.out.println("Invalid number of passwords. Exiting.");
            input.close(); // Close scanner
            return;
        }

        // Instantiate a PasswordLengthInput object for getting password length
        PasswordLengthInput lengthInput = new PasswordLengthInput();
        PasswordGenerator[] generators = new PasswordGenerator[num];

        try {
            // Create password generators based on user's choice
            for (int i = 0; i < num; i++) {
                generators[i] = PasswordGeneratorFactory.createPasswordGenerator(choice);
                
                // Get password length from user
                int length = lengthInput.getPasswordLength();
                if (length > 0) {
                    generators[i].setLength(length);  // Set the length if valid
                    System.out.println("Generated Password: " + generators[i].generatePassword());
                } else {
                    System.out.println("Invalid password length entered. Skipping password generation.");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            // Clean up resources by closing the password generators
            for (PasswordGenerator generator : generators) {
                if (generator instanceof AutoCloseable) {
                    try {
                        ((AutoCloseable) generator).close();
                    } catch (Exception e) {
                        System.out.println("Failed to close resources: " + e.getMessage());
                    }
                }
            }

            // Close the PasswordLengthInput and main Scanner at the end
            lengthInput.close();
            input.close();
        }
    }
}
