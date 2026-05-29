class Solution {
    public String minWindow(String s, String t) {


        if(s.length()<t.length()){
            return "";
        }

        int [] need= new int[128];
        int [] window= new int[128];
        int left=0;
        int formed=0;
        int required=0;
        int start=0;
        int minLength=Integer.MAX_VALUE;


        for (int i=0;i<t.length();i++){

            if(need[t.charAt(i)]==0){
                required++;
            }
            need[t.charAt(i)]++;
        }


        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);

            window[ch]++;

            if(need[ch]>0 && window[ch]==need[ch]){
                formed++;
            }

            while(formed==required){

                int windowLength=right-left+1;

                if(windowLength<minLength){
                    start=left;
                    minLength=windowLength;
                }

                char leftChar=s.charAt(left);

                window[leftChar]--;

                if(need[leftChar]>0 && window[leftChar]<need[leftChar]){
                    formed--;
                }
                left++;
            }
        }

        return minLength==Integer.MAX_VALUE?"": s.substring(start,start+minLength);

       
    }
}
