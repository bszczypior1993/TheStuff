import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

public class LetterCapitalizer {

    private String filePath;

    public static void main(String[] args) {
        LetterCapitalizer letterCapitalizer = new LetterCapitalizer("C:/Users/bszcz/OneDrive/data.txt");
        letterCapitalizer.writeToFile("C:/Users/bszcz/OneDrive/output.txt");
    }

    public LetterCapitalizer(String filePath) {
        this.filePath = filePath;
    }

    public String readText() {
        try {
            String text = Files.readString(Paths.get(this.filePath));
            return text;
        } catch (
                IOException var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public String capitalizeLetters() {
        String text = readText();
        text = text.toUpperCase(Locale.ROOT);
        return text;
    }

    public void writeToFile(String filePath) {
        String text = capitalizeLetters();
        try {
            Files.writeString(Paths.get(filePath), text);
        } catch (IOException exception) {
            exception.printStackTrace();
            return;
        }
    }
}