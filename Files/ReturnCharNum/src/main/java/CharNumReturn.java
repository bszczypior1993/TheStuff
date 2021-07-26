import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CharNumReturn {

    private String filePath;

    public static void main(String[] args) {
        CharNumReturn charNumReturn = new CharNumReturn("C:/Users/bszcz/OneDrive/data.txt");
        System.out.println(charNumReturn.returnNumberOfCharacters());
    }

    public CharNumReturn(String filePath) {
        this.filePath = filePath;
    }

    public int returnNumberOfCharacters() {
        try {
            String text = Files.readString(Paths.get(this.filePath));
            return text.length();
        } catch (
                IOException var2) {
            var2.printStackTrace();
            return 0;
        }
    }
}