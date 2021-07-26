import javax.annotation.processing.SupportedSourceVersion;

public class LetterCapitalizer {


    public static void main(String[] args) {
        System.out.println(LetterCapitalizer.capitalizeLetters("barbara szczypior"));
    }

    public static String capitalizeLetters(String text) {
        text = text.toUpperCase();
        return text;
    }
}