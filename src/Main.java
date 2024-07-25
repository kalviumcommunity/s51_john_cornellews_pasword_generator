package src;

public class Main {
    public static void main(String[] args) {
        // Example usage
        AlphanumericPasswordGenerator alphaGen = new AlphanumericPasswordGenerator();
        alphaGen.getLengthFromUser(); // Get length from user
        System.out.println("Alphanumeric Password: " + alphaGen.generatePassword());
        SpecialCharacterPasswordGenerator specialGen = new SpecialCharacterPasswordGenerator();
        specialGen.getLengthFromUser(); // Get length from user
        System.out.println("Special Character Password: " + specialGen.generatePassword());
    }
}
