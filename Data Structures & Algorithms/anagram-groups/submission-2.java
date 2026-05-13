class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
       HashMap<String,List<String>> map=new HashMap<>();


       for(String s:strs){

            // int [] freq=new int[26];

            // for(char c:s.toCharArray()){
            //     freq[c-'a']++;
            // }

            // StringBuilder key=new StringBuilder();
            // for(int i=0;i<26;i++){
            //     key.append(freq[i]);
            //     key.append('#');
            // }

            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
       }

       return new ArrayList<>(map.values());

    }
}
