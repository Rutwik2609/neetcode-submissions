class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] suff = new int[n];   // this is actually prefix array
        
        // prefix products
        suff[0] = 1;
        for (int i = 1; i < n; i++) {
            suff[i] = suff[i - 1] * nums[i - 1];
        }

        // suffix products (right side) using one variable
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            suff[i] = suff[i] * right;   // prefix * suffix
            right = right * nums[i];     // update suffix for next element to the left
        }

        return suff;
    }
}