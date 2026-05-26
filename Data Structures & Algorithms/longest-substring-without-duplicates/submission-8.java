class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int max = 0;
        int count = 0;
        int i = 0;

        for (char ch : s.toCharArray()) {
            if (set.add(ch)) {
                count++;
            } else {
                max = Math.max(count, max);
                while (!set.add(ch)) {
                    set.remove(s.charAt(i++));
                    count--;
                }
                count++;
            }
        }

        max = Math.max(count, max);
        return max;
    }
}
