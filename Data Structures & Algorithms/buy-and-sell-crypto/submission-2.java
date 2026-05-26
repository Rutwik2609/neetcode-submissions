class Solution {
    public int maxProfit(int[] arr) {
        int max=0;
        int min=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }else{
                max=Math.max(arr[i]-min,max);
            }
        }
        return max;
    }
}
