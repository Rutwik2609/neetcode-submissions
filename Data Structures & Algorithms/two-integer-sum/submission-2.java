class Solution {
    public int[] twoSum(int[] nums, int target) {

        //create Map to store K -> V pairs, where K is compliment -> V is index
        Map<Integer, Integer> compliment = new HashMap<>();


        //For loop to iterate through the array once
        for(int i = 0; i < nums.length; i++){
            //formula to find the difference
            int difference = target - nums[i];
            //check if difference exists in Hashmap, if so, return compliment + index (ie answer)
            if(compliment.containsKey(difference)){
                return new int[]{compliment.get(difference), i};
            }
            //if compliment doesn't exist, add element value as key and its index as value
            compliment.put(nums[i], i);
        }
        return new int[]{}; //this will not be executed, as solution is guarenteed by PS.
    }
}
