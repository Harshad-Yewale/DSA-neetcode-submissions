class Solution {
    public int[] productExceptSelf(int[] nums) {

        int zeroCount=0;
        int total=1;

        for (int i : nums){

            if(i==0){
                zeroCount++;
            }
            else{
            total *=i;
            }
        }

        for(int i=0;i<nums.length;i++){

            if(zeroCount>1){
                nums[i]=0;
            }
            else if(zeroCount==1){
                nums[i]= (nums[i]==0) ? total : 0;
            }
            else{
                nums[i]=total/nums[i];
            }
        }

        return nums;
    }
}  
