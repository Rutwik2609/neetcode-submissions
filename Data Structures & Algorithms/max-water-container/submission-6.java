class Solution {
    public int maxArea(int[] h) {
        
        int l=0;
        int r=h.length-1;

        int res = 0;

        while(l<r){
            int maxh=Math.min(h[l],h[r]);
            int area = maxh * (r-l);
            res=Math.max(res,area);
            if(h[l]>h[r]){
                r--;
            }else{
                l++;
            }
        }
        return res;
    }
}
