class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCount=0;
        HashSet<Integer> set=new HashSet<>();

        for(int i: nums){
            set.add(i);
        }

        for(int i : set){
            if(!set.contains(i-1)){
                int current =i;
                int count=1;
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
               maxCount= Math.max(count,maxCount);
            }
        }
        return maxCount;
    }
}
