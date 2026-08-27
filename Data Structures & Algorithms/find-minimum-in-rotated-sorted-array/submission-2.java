class Solution {
    public int findMin(int[] nums) {

        if(nums.length<=1){
            return nums[0];
        }

        int left =0;
        int right = nums.length-1;
        int min = nums[0];

        while(left<=right){

            if(nums[left]<nums[right]){
                min = Math.min(min, nums[left]);
            }

            int mid=left+ (right-left)/2;

            if(nums[left]<=nums[mid]){
                min = Math.min(min, nums[left]);
                left=mid+1;
            }
            if(nums[mid]<=nums[right]){
                min = Math.min(min, nums[mid]);
                right=mid-1;
            }
           
        }

        return min;
    }
}
