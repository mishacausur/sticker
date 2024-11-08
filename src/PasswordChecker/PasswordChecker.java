package PasswordChecker;

final public class PasswordChecker {
    protected int minLenght;
    protected int maxRepeats;

    public PasswordChecker(int minLenght, int maxRepeats) {
        this.minLenght = minLenght;
        this.maxRepeats = maxRepeats;
    }

    public void setMinLength(int minLenght) {
        this.minLenght = minLenght;
    }


}
