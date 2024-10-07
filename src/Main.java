public class Main {
    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";

    public static void main(String[] args) {
        int count = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TEXT.length()-2; i++) {
            sb.append(TEXT.charAt(i));
            sb.append(TEXT.charAt(i + 1));
            sb.append(TEXT.charAt(i + 2));
            if (sb.toString().equals(PATTERN)) {
                count++;
            }
            sb.replace(0, 3, "");
        }

        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}