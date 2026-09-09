class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] res = new int[n];

        boolean zero = false;

        Set<Integer> zeros = new TreeSet<>();
        int prod = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeros.add(i);
                zero = true;
            }
            else{
                prod *= nums[i];
            }
        }

        if(zeros.size()>1) return res;

        if (zero) {
            for(int i : zeros){
                res[i]=prod;
            }
        } else {
            for (int i = 0; i < n; i++) {
                res[i] = prod / nums[i];
            }
        }

        return res;
    }
}
