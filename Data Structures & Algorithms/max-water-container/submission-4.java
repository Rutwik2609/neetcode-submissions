class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int maxa = 0;

        while (l < r) {
            int left = heights[l];
            int right = heights[r];

            int area = (r - l) * Math.min(left, right);
            if (area > maxa) maxa = area;

            // Move the pointer at the smaller height
            if (left <= right) {
                // Skip all heights that are <= current left height
                while (l < r && heights[l] <= left) l++;
            } else {
                // Skip all heights that are <= current right height
                while (l < r && heights[r] <= right) r--;
            }
        }

        return maxa;
    }
}
