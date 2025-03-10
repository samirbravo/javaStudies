package algorithms;

//Given an array of integers, where all elements but one occur twice, find the unique element.
// a = []1,2,3,4,3,2,1]
//The unique element is 4.

import java.util.List;

public class LonelyInteger {
    public static int getLonelyInteger(List<Integer> arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR operation
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 2, 1);

        System.out.println(getLonelyInteger(arr)); // Print the unique number
    }
}
