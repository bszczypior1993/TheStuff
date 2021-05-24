package EvenOrOdd;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(evenOdd(5));
    }

    public static String evenOdd(int numberInput) {
        String feedback = "";
        int modulo = numberInput % 2;
        {
            if (modulo == 0) {
                feedback = "even";
            } else {
                feedback = "odd";
            }
            return feedback;
        }
    }
}