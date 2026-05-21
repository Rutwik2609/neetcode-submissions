class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;

        int maxa=Integer.MIN_VALUE;

        while(l<r){
            maxa = Math.max(maxa,((r-l)*(Math.min(heights[l],heights[r]))));

            if(heights[l]>heights[r]){
                r--;
            }else{
                l++;
            }
        }
        return maxa;
    }
}
