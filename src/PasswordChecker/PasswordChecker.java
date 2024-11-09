package PasswordChecker;

final public class PasswordChecker {
    protected int minLenght;
    protected int maxRepeats;

    public void setMinLength(int minLenght) throws Exception {
        if (minLenght < 1) {
            throw new IllegalArgumentException("Минимальная длина пароля должна быть больше 0 символов");
        }
        this.minLenght = minLenght;
    }

    public void setMaxRepeats(int maxRepeats) throws Exception {
        if (maxRepeats < 0) {
            throw new IllegalArgumentException("Количество повторений символа не может быть отрицательным");
        }
        this.maxRepeats = maxRepeats;
    }

    public boolean verify(String password) throws Exception {
        if (maxRepeats < 1 && minLenght < 1) {
            throw new IllegalStateException("Не установлены необходимые значения длина пароля и количества попыток");
        }
        return (password.length() >= minLenght && !countCharRepeat(password, maxRepeats));
    }

    private boolean countCharRepeat(String text, int maxRepeats) {
        int count = 1;
        for (int i = 1; i < text.length() ; i++) {
            if (text.charAt(i) == text.charAt(i-1)) {
                count++;
            } else {
                count = 1;
            }
            if (count > maxRepeats) {
                return true;
            }
        }
        return false;
    }
}
