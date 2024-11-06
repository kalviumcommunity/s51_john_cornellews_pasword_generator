package src;

public class PasswordGeneratorFactory {
    public static PasswordGenerator createPasswordGenerator(String choice) {
        switch (choice) {
            case "alpha":
                return new AlphanumericPasswordGenerator();
            case "special":
                return new SpecialCharacterPasswordGenerator();
            default:
                throw new IllegalArgumentException("Invalid password generator choice");
        }
    }
}
