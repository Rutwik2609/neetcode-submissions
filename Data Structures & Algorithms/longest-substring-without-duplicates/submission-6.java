
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();

        int l = 0, maxLen = 0;

        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);

            // If duplicate, shrink from left until duplicate removed
            while (set.contains(ch)) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}