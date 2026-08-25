class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int maxPile=piles[0];

        for(int pile : piles ){
            maxPile = Math.max(maxPile, pile);
        }

        int left=0;
        int right=maxPile;

        while(left<right){
            int mid=left+ (right-left) /2;

            if(canFinish(piles, mid, h)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        
        return left;
    }

    private boolean canFinish(int[] piles , int i, int h){
        int hours=0;

        for(int pile:piles){
             hours += Math.ceil((double)pile / i);
        }

        return hours<=h;
    }
}
