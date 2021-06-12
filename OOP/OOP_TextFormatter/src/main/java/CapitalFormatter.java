import java.util.Locale;

public class CapitalFormatter implements TextFormatter{

    public static void main (String[] args){
        CapitalFormatter capitalFormatter = new CapitalFormatter("Java text formatting task");
        System.out.println(capitalFormatter.formatText(capitalFormatter.text));
    }

String text;
    protected CapitalFormatter(String text){
        this.text = text;
    }

    public String formatText(String text){
        return text.toUpperCase(Locale.ROOT);

    }

}
