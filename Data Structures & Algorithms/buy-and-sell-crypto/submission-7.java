class Solution {
    public int maxProfit(int[] p) {
        int l=0;
        int r=p.length;
        int pr=0;
        int minp=p[0];
        for(int i=1;i<r;i++){
            if(p[i]<minp){
                minp=p[i];
            }else{
                pr = Math.max(pr,p[i]-minp);
            }
        }
        return pr;
    }
}
