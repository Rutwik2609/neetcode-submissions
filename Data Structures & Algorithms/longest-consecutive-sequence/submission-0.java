class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
        int res=0;
        for(int i : set){
            int j=0;
            while(set.contains(i--)){
                j++;
            }
            res=Math.max(j,res);
        }
        
        return res;
    }
}
