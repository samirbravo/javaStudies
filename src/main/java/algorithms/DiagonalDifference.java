package algorithms;

//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//For example, the square matrix arr is shown below:
// 1 2 3
// 4 5 6
// 9 8 9
// 1 + 5 + 9 = 15, 3 + 5 + 9 = 17. The absolute differance 15 - 17 = 2

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftDiagonalSum += arr.get(i).get(i);
            rightDiagonalSum += arr.get(i).get(arr.size() - 1 - i);
        }

        return Math.abs(leftDiagonalSum - rightDiagonalSum);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(
                List.of(11, 2, 4),
                List.of(4, 5, 6),
                List.of(10, 8, -12));

        System.out.println(diagonalDifference(arr)); // Print the unique numb
    }
}
