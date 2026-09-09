class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
           return map.get(b) - map.get(a);
        });

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i : map.keySet()){
            pq.offer(i);
        }

        int[] res = new int[k];

        for(int i=0;i<k;i++){
            res[i]=pq.poll();
        }

        return res;
    }
}
