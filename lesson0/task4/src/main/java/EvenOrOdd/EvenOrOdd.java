package EvenOrOdd;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(isEven(5));
    }

    public static boolean isEven(int numberInput) {
        boolean even = true;
        boolean odd = false;
        int modulo = numberInput % 2;
        {
            if (modulo == 0) {
                return even;
            } else {
                return odd;
            }
        }
    }
}