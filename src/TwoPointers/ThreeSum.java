package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Question
//https://leetcode.com/problems/3sum/description/
public class ThreeSum {

    public static void main(String[] args) {

        System.out.println(ThreeSumSolution(Arrays.asList(-1, 0, 1, 2, -1, -4).stream().mapToInt(Integer::intValue).toArray()));
    }

    public static List<List<Integer>> ThreeSumSolution(int arr[]) {

        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int length = arr.length - 1;
        for (int i = 0; i < arr.length - 2; i++) {

            if (i == 0 || (i > 0 && (arr[i] != arr[i - 1]))) {
                int a = arr[i];
                int b = 0 - a;
                int low = i + 1;
                int high = length;
                while (low < high) {
                    if (arr[low] + arr[high] == b) {
                        list.add(List.of(arr[i], arr[low], arr[high]));
                        while (low < high && arr[low] == arr[low + 1]) low++;
                        while (low < high && arr[high] == arr[high - 1]) high--;
                        low++;
                        high--;
                    } else if (arr[low] + arr[high] > b) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return list;

    }
}
