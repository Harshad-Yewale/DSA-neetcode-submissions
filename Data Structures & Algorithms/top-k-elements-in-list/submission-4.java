class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       HashMap<Integer,Integer> map=new HashMap<>();
       PriorityQueue<int[]> queue=new PriorityQueue<>(
         (a,b) -> a[1] - b[1]
       );

       for(int i : nums){
          map.put(i,map.getOrDefault(i,0)+1);
       } 

       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            queue.offer(new int[]{entry.getKey() , entry.getValue()});
            if(queue.size()>k){
                queue.poll();
            }
       }

       int[] res=new int[k];
       int i=0;

       while(!queue.isEmpty()){
        res[i]=queue.poll()[0];
        i++;
       }
       return res;



    }
}
