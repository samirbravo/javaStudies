package algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {8, 5, 2, 9, 5, 6, 3}; //expected output: [2, 3, 5, 5, 6, 8, 9]
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    public static int[] selectionSort(int[] array) {
        if (array.length == 0) return new int[]{};

        for (int startIdx = 0; startIdx < array.length - 1; startIdx++) {
            int smallestIdx = startIdx;
            for (int i = startIdx + 1; i < array.length; i++) {
                if (array[smallestIdx] > array[i]) {
                    smallestIdx = i;
                }
            }
            swap(startIdx, smallestIdx, array);
        }
        return array;
    }

    public static void swap(int i, int j, int[] array) {
        System.out.println("Swapping: " + array[i] + " and " + array[j]);
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
