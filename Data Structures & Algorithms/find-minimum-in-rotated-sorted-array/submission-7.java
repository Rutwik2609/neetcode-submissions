class Solution {
    public int findMin(int[] nums) {
        int m = Integer.MAX_VALUE;
        for(int i : nums){
            if(i<m){
                m=i;
            }
        }
        return m;
    }
}
