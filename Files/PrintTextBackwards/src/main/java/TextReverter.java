import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextReverter {

    private String filePath;

    public static void main(String[] args) {
        TextReverter textReverter = new TextReverter("C:/Users/bszcz/OneDrive/data.txt");
        System.out.println(textReverter.revertText());
    }

    public TextReverter(String filePath) {
        this.filePath = filePath;
    }

    public String revertText() {
        try {
            String text = Files.readString(Paths.get(this.filePath));
            char[] textReverted = new char[text.length()];
            for (int i = 0; i < text.length(); i++) {
                textReverted[i] = text.charAt(text.length() - i - 1);
            }
            String revertedText = new String(textReverted);
            return revertedText;
        } catch (
                IOException var2) {
            var2.printStackTrace();
            return null;
        }
    }
}