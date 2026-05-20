

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];

            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            // Build a collision-free key: include all 26 counts + delimiter
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append('#').append(freq[i]);
            }

            // map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
            String k = key.toString();
            if (!map.containsKey(k)) {
                map.put(k, new ArrayList<>());
            }
            map.get(k).add(s);

        }

        return new ArrayList<>(map.values());
    }
}
