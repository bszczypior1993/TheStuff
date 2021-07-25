import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ContentRead {
    public static void main(String[] args) {
        ContentRead contentRead = new ContentRead("C:/Users/bszcz/OneDrive/data.txt");

        System.out.println(contentRead.readText());

    }

    private String filePath;

    public ContentRead(String filePath) {
        this.filePath = filePath;
    }

    public String readText() {
        try {
            String text = Files.readString(Paths.get(filePath));
            return text;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
