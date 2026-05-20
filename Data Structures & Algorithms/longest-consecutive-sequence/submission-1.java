class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
        int res=0;
        for(int i : set){
            if(!set.contains(i-1)){
                int curr=i;
                int len=0;
                while(set.contains(i++)){
                    len++;
                }
                res=Math.max(res,len);
            }
        }
        
        return res;
    }
}
