class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }


        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.offer(new int[]{entry.getKey(),entry.getValue()});

            if(pq.size()>k){
                pq.poll();
            }
        }

        int [] res=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            res[i++]=pq.poll()[0];
        }

        return res;
      /*  ArrayList<Map.Entry<Integer,Integer>> res=new ArrayList<>(map.entrySet());

        res.sort((a,b)->b.getValue()-a.getValue());

        int[] arr=new int[k];

        for(int i=0;i<arr.length;i++){
            arr[i]=res.get(i).getKey();
        }

        return arr;
        */
    }
}
