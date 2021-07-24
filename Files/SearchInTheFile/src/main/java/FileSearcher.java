import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileSearcher {

    private String filePath;
    private String query = "Koniec";

    public static void main(String[] args) {
        FileSearcher fileSearcher = new FileSearcher("C:/Users/bszcz/OneDrive/data.txt");
        System.out.println(fileSearcher.searchInTheFile());
    }

    public FileSearcher(String filePath) {
        this.filePath = filePath;
    }

    public boolean searchInTheFile() {
        boolean result = false;
        try {
            String text = Files.readString(Paths.get(this.filePath));
            if (text.contains(query)) {
                result = true;
            }
        } catch (
                IOException var2) {
            var2.printStackTrace();
            result = false;
        }
        return result;
    }
}

