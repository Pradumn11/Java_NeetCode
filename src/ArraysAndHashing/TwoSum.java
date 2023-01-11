package ArraysAndHashing;

import java.util.HashMap;

//Question
//https://leetcode.com/problems/two-sum/description/

public class TwoSum {
    public int[] twoSumSolution(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(map.containsKey(a)){
                return new int[]{i,map.get(a)};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[2];
    }
}
