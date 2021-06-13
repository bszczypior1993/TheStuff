import java.util.Locale;

public class LowercaseFormatter implements TextFormatter{

        public static void main (String[] args){
            LowercaseFormatter lowercaseFormatter = new LowercaseFormatter();
            System.out.println(lowercaseFormatter.formatText("javA MEtHOD"));
        }


        public String formatText(String text){
            return text.toLowerCase(Locale.ROOT);
        }
    }
