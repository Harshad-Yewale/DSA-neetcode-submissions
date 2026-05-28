class Solution {
    public boolean checkInclusion(String s1, String s2) {


        int[] counts =new int[26];


        for(int i=0; i<s1.length();i++){
            counts[s1.charAt(i)-'a']++;
        }

        int i=0;
        int j=0;

        while(j<s2.length()){
            counts[s2.charAt(j)-'a']--;

            while(counts[s2.charAt(j)-'a']<0){
                counts[s2.charAt(i)-'a']++;
                i++;
            }

            if(j-i+1==s1.length()){
                return true;
            }
            j++;
        }

        // int[] s1Freq=new int[26];
        // int[] windowFreq=new int[26];

        // if(s1.length()>s2.length()){
        //     return false;
        // }


        // for(int i=0; i<s1.length();i++){
        //     s1Freq[s1.charAt(i)-'a']++;
        //     windowFreq[s2.charAt(i)-'a']++;
        // }

        // if(Arrays.equals(s1Freq,windowFreq)){
        //     return true;
        // }

        // for(int i=s1.length();i<s2.length();i++){

        //     windowFreq[s2.charAt(i)-'a']++;

        //     windowFreq[s2.charAt(i-s1.length())-'a']--;

        //     if(Arrays.equals(s1Freq,windowFreq)){
        //         return true;
        //     }
        // }

        return false;
    }
}
