class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLength=0;
        int left=0;
        HashSet<Character> set=new HashSet<>();

        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);

        }

        // for(int i=0; i<s.length();i++){
        //      HashSet<Character> set=new HashSet<>();
        //     for(int j=i; j<s.length();j++){
                
        //         if(set.contains(s.charAt(j))){
        //             break;
        //         }
        //         else{
        //             set.add(s.charAt(j));
        //         }
        //         maxLength=Math.max(maxLength,set.size());
        //     }
        // }
        return maxLength;
    }
}
