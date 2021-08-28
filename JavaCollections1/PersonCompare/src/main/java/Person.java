public class Person implements Comparable {

    String name;
    String surname;
    int birthYear;
    int height;
    int weight;

    Person(String name, String surname, int birthYear, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;

    }

    @Override
    public int compareTo(Object o) {
        try {
            Person per = (Person) o;
            if(birthYear<per.birthYear){
                return 1;}
            else if (birthYear == per.birthYear){
                return 0;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return 404;
        }
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public int getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }
}