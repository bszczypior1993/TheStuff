import javax.annotation.processing.SupportedSourceVersion;

public class TextLengthCheck {

    public static void main(String[] args) {
        System.out.println(TextLengthCheck.returnNumberOfCharacters("sddfsdfsdgfdfg"));
    }

    public static int returnNumberOfCharacters(String text) {
        return text.length();
    }
}
