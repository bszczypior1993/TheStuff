public class DivisionByThreeCheck {

    public static void main(String[] args) {
        DivisionByThreeCheck.validateIfDividibleByThreeForTheArray(new int[]{3, 4, 5, 6, 6, 7, 8});
    }

    public static void validateIfDividibleByThree(int value) {
        if (value % 3 == 0) {
            System.out.println("Divided by 3");

        } else throw new IllegalArgumentException();
    }

    public static void validateIfDividibleByThreeForTheArray(int[] values) {
        for (int value : values) {
            try {
                validateIfDividibleByThree(value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}