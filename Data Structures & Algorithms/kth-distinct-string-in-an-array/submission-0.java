class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> counts=new HashMap<>();
        int distinctCount=0;

        for(String s : arr){
            counts.put(s,counts.getOrDefault(s,0)+1);
        }

        for(String s : arr){

            if(counts.get(s)==1){
                distinctCount++;
            }

            if(distinctCount==k){
                return s;
            }
        }

        return "";
    }
}