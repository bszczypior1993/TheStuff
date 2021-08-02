import javax.annotation.processing.SupportedSourceVersion;

public class LetterCapitalizer {


    public static void main(String[] args) {
        System.out.println(LetterCapitalizer.capitalizeLetters(""));
    }

    public static String capitalizeLetters(String text) {
        if (!text.isEmpty()) {
            text = text.toUpperCase();
            return text;
        } else {
            return "no text provided";
        }
    }
}