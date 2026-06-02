class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        ArrayList<Integer> ans=new ArrayList<>();
        int winStart=0;
        int winEnd=k;

        while(winEnd<=nums.length){
            int maxInt=nums[winStart];
            for(int i=winStart;i<winEnd;i++){
                maxInt=Math.max(maxInt,nums[i]);
            }
            ans.add(maxInt);
            winStart++;
            winEnd++;
        }

        int[] primitiveArray = ans.stream()
                                   .mapToInt(Integer::intValue)
                                   .toArray();

    
       return primitiveArray;
        
    }
}
