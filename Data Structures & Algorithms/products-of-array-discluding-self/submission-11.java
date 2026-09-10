class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> q = new ArrayList<>();

        int prod = 1;
        int n = nums.length;

        int[] res = new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                q.add(i);
                if(q.size()>=2){
                    return res;
                }
            }else{
                prod*=nums[i];
            }
        }

        for(int i =0;i<n;i++){
            if(!q.isEmpty()){
                if(q.get(0)==i){
                    res[i]=prod;
                }
            }else{
                res[i]=prod/nums[i];
            }
        }

        return res;
    }
}  
