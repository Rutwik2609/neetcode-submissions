class Solution {
    public int maxProfit(int[] arr) {
        int l=0;
        int r=arr.length;
        int diff=0;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
            if(min==arr[i]) continue;
            diff = Math.max(diff,arr[i]-min);
        }
        return diff;
    }
}
