package TwoPointers;

//Question
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        Arrays.stream(TwoSumSolution(arr, 6)).forEach(System.out::println);
    }

    public static int[] TwoSumSolution(int numbers[], int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {

            if (numbers[start] + numbers[end] == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (numbers[start] + numbers[end] > target) end--;
            else start++;
        }
        return result;
    }
}
