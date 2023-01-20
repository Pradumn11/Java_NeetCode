package SlidingWindow;


//Question
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class SellStock {


    public static void main(String[] args) {
        int arr[] = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(SellStockSolution(arr));
    }

    public static int SellStockSolution(int arr[]) {

        int profit = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] - min > profit) {
                profit = arr[i] - min;
            }
        }
        return profit;
    }
}
