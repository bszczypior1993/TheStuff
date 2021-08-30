public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {34, 11, 87, 33, 999, 0};
        System.out.println("Array pre-sorting:");
        printArray(array);
        bubbleSort(array);
        System.out.println("Array post-sorting:");
        printArray(array);
    }

    private static void bubbleSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
