class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int subArrayIndex =-1;

        for(int i=0; i<matrix.length; i++){
            if(matrix[i][matrix[i].length-1] >= target){
                subArrayIndex=i;
                break;
            }
        }

        if(subArrayIndex==-1){
            return false;
        }

        int left = 0;
        int right = matrix[subArrayIndex].length-1;


        while(left<=right){
            int mid = left+(right-left)/2;
            System.out.println(matrix[subArrayIndex][mid]);
            if(matrix[subArrayIndex][mid] == target){
                return true;
            }
            else if (matrix[subArrayIndex][mid] > target){
                right = mid-1;
            }
            else{
                left=left+1;
            }
        }
        return false;
    }
}
