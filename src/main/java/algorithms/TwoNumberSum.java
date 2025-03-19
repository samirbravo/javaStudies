package algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10; // result should be [-1, 11]

        System.out.println(Arrays.toString(twoNumberSum(array, targetSum)));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> hashset = new HashSet<>();

        for (int currentNumber : array) {
            int potentialMatch = targetSum - currentNumber;
            if (hashset.contains(potentialMatch)) {
                return new int[]{currentNumber, potentialMatch};
            }
            hashset.add(currentNumber);
        }
        return new int[0];
    }
}
