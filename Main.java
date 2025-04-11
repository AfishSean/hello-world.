public class NumberSorter {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};
        sortAscending(numbers);
        
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void sortAscending(int[] array) {
        // Bubble sort implementation
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
