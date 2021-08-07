import java.util.*;

public class NameList {

    public static void main(String[] args) {

        ArrayList<java.lang.String> names = new ArrayList<>(Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr"));
        Set<String> namesNoDuplicates = new LinkedHashSet<>(names);;
        ArrayList<java.lang.String> newListBackwards = arrangeBackwards(names);
        ArrayList<java.lang.String> newListSwappedNames = swapNames(names);
        System.out.println("Lista bez duplikatów: " + namesNoDuplicates);
        System.out.println("Lista od końca: " + newListBackwards);
        System.out.println("Elementy po zmianie : Anna -> Joanna: " + newListSwappedNames);

    }

    public static <String> ArrayList<java.lang.String> arrangeBackwards(ArrayList<java.lang.String> namesBackwards) {
        Collections.reverse(namesBackwards);
        return namesBackwards;
    }

    public static <String> ArrayList<java.lang.String> swapNames(ArrayList<java.lang.String> namesSwapped) {
        Collections.replaceAll(namesSwapped, "Anna", "Joanna");
        Collections.reverse(namesSwapped);
        return namesSwapped;

    }
}

