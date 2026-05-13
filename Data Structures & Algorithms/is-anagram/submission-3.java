class Solution {
    public boolean isAnagram(String s, String t) {

      /* HashMap<Character,Integer> map1=new HashMap<>();
       
       for(char c: s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)-1);
        }

        for(int v : map1.values()){
            if(v!=0){
                return false;
            }
        }
        

        return true;*/

        // optimal soultion

        int[] arr=new int[26];

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']+=1;
            arr[t.charAt(i)-'a']-=1;
        }

        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
