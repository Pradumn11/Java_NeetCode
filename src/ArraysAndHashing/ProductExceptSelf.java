package ArraysAndHashing;

import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4};
//        ProductExceptSelfSolution(arr);
        ProductExceptSelfSolution2(arr);
    }

    public static int[] ProductExceptSelfSolution(int nums[]) {
        int l = nums.length;
        int[] res = new int[l];
        int[] left = new int[l];
        int[] right = new int[l];
//         Left and right extreme elements have no product in their either sides, so keeping their values = 1.
        left[0] = 1;
        right[l - 1] = 1;

//         Computing the left side of product for every element
        for (int i = 1; i < l; i++) {
// 1   1   2   6
            left[i] = left[i - 1] * nums[i - 1];
            System.out.println(i + " left: " + left[i] + " left[i-1]: " + left[i - 1] + " nums[i-1] " + nums[i - 1]);
        }

//         the right side of product for every element
        for (int j = l - 2; j >= 0; j--) {

            right[j] = right[j + 1] * nums[j + 1];
            // 24   12    4     1
        }


//         the values, for any ith index multiply products on it's left side and of it's right side as computed, so we can skip that value
        for (int i = 0; i < l; i++) {
            res[i] = left[i] * right[i];
            // 24   12    4     1
            // 1    1     2     6
        }
        return res;
    }


    public static int[] ProductExceptSelfSolution2(int nums[]) {

        int arr[] = new int[nums.length];
        boolean zero = false;
        int index = 0;
        int total = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (zero) {
//                    check if double zero,yes then return empty array
                    return arr;
                }
//                if one zero get its index
                zero = true;
                index = i;
            } else {
                total = total * nums[i];
            }
        }
        if (zero) {
//      if zero, only its own index will be present rest will be zeros
            arr[index] = total;
        } else {
            for (int i = 0; i < nums.length; i++) {
                arr[i] = total / nums[i];
            }
        }
        return arr;
    }
}

