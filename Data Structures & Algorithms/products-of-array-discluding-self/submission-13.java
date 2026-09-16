class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int prod = 1;

        List<Integer> z = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                z.add(i);
                continue;
            }
            prod *= nums[i];
        }

        int pos;

        if (z.size() > 1) {
            return res;
        }

        for (int i = 0; i < n; i++) {
            if (!z.isEmpty() && i == z.get(0)) {
                res[i] = prod;
                return res;
            }
        }

        for (int i = 0; i < n; i++) {
            res[i] = prod / nums[i];
        }
        return res;
    }
}
