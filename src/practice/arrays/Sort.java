package practice.arrays;

public class Sort {

    public static void main(String[] args) {
        int[] myArray = {106, 26, 81, 5, 15};
        int[] sorted = sortArray(myArray);
        printArray(sorted);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted: " + array[i]);
        }
    }

    public static int[] sortArray(int[] myArray) {
        int[] sortedArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            sortedArray[i] = myArray[i];
        }
        boolean flag = true;
        int temp;

        // Bubble sort
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

}
