class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res= new int[2];
        int i=0;
        int j=numbers.length-1;

        while(i<j){

            int sum= numbers[i]+numbers[j];
            if(sum<target){
                i++;
            }
            if(sum>target){
                j--;
            }
            if(sum==target){
                res[0]=i+1;
                res[1]=j+1;
               break;
            }

        }


        // while(i<numbers.length-1){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]!=numbers[j] && numbers[i]+numbers[j]==target){
        //             res[0]=i+1;
        //             res[1]=j+1;
        //             return res;
        //     }
        //     }
        //     i++;
        // }

        return res;
    }
}
