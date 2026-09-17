class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();

        Set<Character> set = new HashSet<>();

        int maxlen =0;
        int currlen=0;
        int j=0;
        for(int i=0;i<n;i++){
            while(i<n && !set.add(s.charAt(i))){
                set.remove(s.charAt(j++));
            }
            set.add(s.charAt(i));
            maxlen=Math.max(set.size(),maxlen);
        }
        maxlen=Math.max(set.size(),maxlen);
        return maxlen;

    }
}
