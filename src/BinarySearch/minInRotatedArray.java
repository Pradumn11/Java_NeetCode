package BinarySearch;

//Question
//
public class minInRotatedArray {
        public int findMin(int[] nums) {

            int i=0;
            int h=nums.length-1;

            while(i<=h){
                int mid=(i+h)/2;

                if(mid>0 && nums[mid]<nums[mid-1]){
                    return nums[mid];
                }else if(nums[i]<=nums[mid]&&nums[mid]>nums[h]){
                    i=mid+1;
                }else
                    h=mid-1;
            }
            return nums[i];
        }
    }


