class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int p = 1;
        int zeros = 0;

        for (int x : nums) {
            if (x == 0) zeros++;
            else p *= x;
        }

        for (int i = 0; i < n; i++) {
            if (zeros > 1) {
                res[i] = 0;
            } else if (zeros == 1) {
                res[i] = (nums[i] == 0) ? p : 0;
            } else {
                res[i] = p / nums[i];
            }
        }
        return res;
    }
}