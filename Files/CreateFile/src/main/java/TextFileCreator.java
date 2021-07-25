import org.w3c.dom.Text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;


public class TextFileCreator {
    public static void main(String[] args) {
        TextFileCreator textFileCreator = new TextFileCreator("C:/Users/bszcz/OneDrive/data.txt");
        textFileCreator.createAndWriteInAFile();
    }
    private String filePath;
    private String text = "Kurs\n" +
            "Java\n" +
            "Lekcja 6\n" +
            "Pliki\n" +
            "Wyjątki\n" +
            "Pliki\n" +
            "Koniec pliku";

    public TextFileCreator(String filePath) {
        this.filePath = filePath;
    }

    private void createTextFile() {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            if (!file.canWrite()) {
                System.out.println("You can't write in this file");
                return;
            }
        }
    }

    private void writeToFile(String filePath, String text) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath), Charset.defaultCharset(), new OpenOption[0])) {
            writer.write(text);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void createAndWriteInAFile() {
        createTextFile();
        writeToFile(filePath, text);
    }
}