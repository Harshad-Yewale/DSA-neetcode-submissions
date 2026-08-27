class Solution {
    public int findMin(int[] nums) {

        if(nums.length<=1){
            return nums[0];
        }

        int n = nums.length-1;
        int left =0;
        int right = n;
        int min = nums[0];

        while(left<=right){

            if(nums[left]<nums[right]){
                min = Math.min(min, nums[left]);
            }

            int mid=left+(right-left)/2;

            if(nums[left]<=nums[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            min = Math.min(nums[mid],min);
        }

        return min;
    }
}
