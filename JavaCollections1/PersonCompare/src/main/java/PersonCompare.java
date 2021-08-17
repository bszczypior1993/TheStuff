import java.util.Set;
import java.util.TreeSet;
import java.lang.Comparable;

public class PersonCompare extends Person implements Comparable<PersonCompare>{


    PersonCompare(String name, String surname, int birthYear, int height, int weight) {
        super(name, surname, birthYear, height, weight);
    }

    public static void main(String[] args) {

        PersonCompare personCompare = new PersonCompare(name, surname, birthYear, height, weight);

        Set<PersonCompare> people = new TreeSet<>();
        people.add((PersonCompare) new PersonCompare("Barbara", "Szczypior", 1993, 157, 67));
        people.add((PersonCompare) new PersonCompare("Keanu", "Reeves", 1964, 186, 67));
        people.add((PersonCompare) new PersonCompare("Tommy", "Wiseau", 1955, 174, 70));
        people.add((PersonCompare) new PersonCompare("Dua", "Lipa", 1995, 173, 58));
        people.add((PersonCompare) new PersonCompare("Will", "Smith", 51, 188, 70));

        System.out.println("Before sorting:" + people);
        
        }

    @Override
    String getName() {
        return PersonCompare.name;
    }


    @Override
    public int compareTo(PersonCompare o) {
        return Integer.compare(this.height, o.height);
    }
}



//    public int compareTo(PersonCompare o) {
//        return Integer.compare(this.birthYear, o.birthYear);

