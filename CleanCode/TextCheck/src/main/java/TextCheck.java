import java.util.Locale;

public class TextCheck {

    public static void main(String[] args) {
        TextCheck textCheck = new TextCheck("KamilSlimak");
        System.out.println(textCheck.isEmpty());
        System.out.println(textCheck.palindromeCheck());
        System.out.println(textCheck.textLength());
    }

    private static String textInput;

    public TextCheck(String textInput) {
        this.textInput = textInput;
    }

    protected boolean isEmpty() {
        return textInput.isEmpty();
    }

    protected String palindromeCheck() {
        String checkResult = "";
        if (!isEmpty()) {
            textInput = textInput.toLowerCase(Locale.ROOT);
            for (int i = 0; i < textInput.length() / 2; i++) {
                if (textInput.charAt(i) != textInput.charAt(textInput.length() - i - 1)) {
                    checkResult = "This string isn't a palindrome";
                } else {
                    checkResult = "This string is a palindrome";
                }
            }
        } else {
            checkResult = "There are no characters in this string";
        }
    return checkResult;
    }
    protected int textLength() {
        int textLength = 0;
        if (!isEmpty()) {
            textLength = textInput.length();
        }
        else {
            textLength = 0;
        }
    return textLength;}
}
