public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.isDividableByTwo(456));
        System.out.println(calculator.sumDigits(456));
    }


    public static boolean isDividableByTwo(int dividableNumberInput) {
        boolean check;
        if (dividableNumberInput % 2 == 0) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public static int sumDigits(int sumNumberInput) {
        int sum = 0;
        sumNumberInput = sumNumberInput / 10;
        while (sumNumberInput > 0) {
            sum = sum + sumNumberInput % 10;
        }
        return sum;
    }

}

