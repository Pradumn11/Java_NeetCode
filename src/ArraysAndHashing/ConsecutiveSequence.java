package ArraysAndHashing;

import java.util.Arrays;

public class ConsecutiveSequence {
//    public static void main(String[] args) {
//        int[] arr=new int[]{1,2,40,5,3,0};
//        System.out.println(ConsecutiveSequenceSolution(arr));
//    }

    public static int ConsecutiveSequenceSolution(int arr[]) {
        if (arr.length == 0) return 0;
        int currentSeq = 1;
        int longSeq = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - arr[i - 1] == 1) {
                currentSeq++;
                if (currentSeq > longSeq) {
                    longSeq = currentSeq;
                }
//          check if the itself-prev!=0or1 then diff is more,thrfore need to reset the currentStreak
            } else if (arr[i] - arr[i - 1] != 0) {
                currentSeq = 1;
            }

        }
        return longSeq;
    }
}
