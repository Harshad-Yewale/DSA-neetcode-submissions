 class Pair{
        int stamp;
        String value;

        public Pair(int stamp, String value){
            this.stamp = stamp;
            this.value = value;
        }
    }


class TimeMap {

    HashMap<String,List<Pair>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
         if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Pair(timestamp, value));
        
    }
    
    public String get(String key, int timestamp) {
         if (!map.containsKey(key)) {
            return "";
        }

        List<Pair> list =  map.get(key);

        int left=0;
        int right=list.size()-1;
        String ans="";

        while(left<=right){
            int mid = left +(right-left) /2;

            if(list.get(mid).stamp<=timestamp){
                ans=list.get(mid).value;
                left=left+1;
            }
            else{
                right=right-1;
            }
        }

        return ans;
        
    }
}
