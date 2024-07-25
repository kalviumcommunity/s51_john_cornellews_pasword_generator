package src;

abstract class PasswordGenerator {
    private int length;
    public abstract String generatePassword();
    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
}
