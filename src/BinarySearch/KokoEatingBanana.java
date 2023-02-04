package BinarySearch;


//Question
//https://leetcode.com/problems/koko-eating-bananas/description/
public class KokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int val:piles){
            max = Math.max(val,max);
        }
        if(h==piles.length){
            return max;
        }
        int speed=Integer.MAX_VALUE;
        int low=1;
        int high=max;
        while(low<=high){

            int mid=(low+high)/2;
            int total=0;
            for(int i=0;i<piles.length;i++){
                total+=Math.ceil((double)piles[i]/mid);
            }
            if(total<=h){
                speed=Math.min(speed,mid);
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        return speed;
    }
}
