public class SquareRootCalculator {
public static void main (String[] args){
    System.out.println(SquareRootCalculator.calculateSquareRoot(4761));
}

    public static double calculateSquareRoot(double numberInput) {
        if (numberInput > 0) {
            return Math.sqrt(numberInput);
        } else throw new IllegalArgumentException();
    }
}
