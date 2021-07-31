import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EveryOtherLineReader {

    private String filePath;

    public static void main(String[] args) {
        EveryOtherLineReader everyOtherLineReader = new EveryOtherLineReader("data/data.txt");
        everyOtherLineReader.readEveryOtherLine();
    }

    public EveryOtherLineReader(String filePath) {
        this.filePath = filePath;
    }

    public String readEveryOtherLine() {
        String line = " ";
        try {
            String text = Files.readString(Paths.get(this.filePath));
            String[] textSplit = text.split("\\r?\\n");
            for (int i = 0; i < textSplit.length; i++) {
                line = (textSplit[i]);
                System.out.println(line);
                i = i + 1;
            }
            return line;
        } catch (IOException var2) {
            var2.printStackTrace();
            return "";
        }
    }
}
