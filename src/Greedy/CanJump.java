package Greedy;


//Question
//https://leetcode.com/problems/jump-game/description/
public class CanJump {
        public boolean canJump(int[] nums) {
            int r=0;

            for(int i=0;i<=r;i++){
                r=Math.max(r,nums[i]+i);
                if(r>=nums.length-1){
                    return true;
                }
            }
            return false;
        }
    }