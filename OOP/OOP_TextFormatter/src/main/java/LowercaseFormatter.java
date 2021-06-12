import java.util.Locale;

public class LowercaseFormatter implements TextFormatter{


        public static void main (String[] args){
            LowercaseFormatter lowercaseFormatter = new LowercaseFormatter ("Java text formatting task");
            System.out.println(lowercaseFormatter.formatText(lowercaseFormatter.text));
        }

        String text;
        protected LowercaseFormatter(String text){
            this.text = text;
        }

        public String formatText(String text){
            return text.toLowerCase(Locale.ROOT);

        }

    }
