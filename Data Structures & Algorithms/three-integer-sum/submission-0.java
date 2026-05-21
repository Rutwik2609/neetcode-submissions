

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);   // 1) Sort the array

        int n = nums.length;

        // 2) Fix first element one by one
        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Optimization: if current number > 0, sum cannot be 0 (because sorted)
            if (nums[i] > 0) break;

            int l = i + 1;
            int r = n - 1;

            // 3) Two pointer search for remaining two numbers
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // Skip duplicates for l and r
                    int leftVal = nums[l];
                    int rightVal = nums[r];

                    while (l < r && nums[l] == leftVal) l++;
                    while (l < r && nums[r] == rightVal) r--;

                } else if (sum < 0) {
                    l++; // Need bigger sum
                } else {
                    r--; // Need smaller sum
                }
            }
        }

        return res;
    }
}