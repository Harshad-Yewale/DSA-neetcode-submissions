class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res= new int[2];
        int i=0;


        while(i<numbers.length-1){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]!=numbers[j] && numbers[i]+numbers[j]==target){
                    res[0]=i+1;
                    res[1]=j+1;
                    return res;
            }
            }
            i++;
        }

        return res;
    }
}
