class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;


        Set<Character> set = new HashSet<>();


        int maxl=Integer.MIN_VALUE;
        int l=0;

        for(char ch : s.toCharArray()){
            if(set.add(ch)){
                continue;
            }else{
                maxl=Math.max(maxl,set.size());
                while(l<s.length()&&!set.add(ch)){
                    set.remove(s.charAt(l++));
                }
            }
        }
        maxl=Math.max(maxl,set.size());
        return maxl;
    }
}
