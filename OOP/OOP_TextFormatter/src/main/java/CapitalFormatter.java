import java.util.Locale;
import java.lang.String;

public class CapitalFormatter implements TextFormatter{

    public void main(String[] args){
        CapitalFormatter capitalFormatter = new CapitalFormatter();
    System.out.println(capitalFormatter.formatText("java method"));
    }

    public String formatText(String text){
                return text.toUpperCase(Locale.ROOT);

    }
}
