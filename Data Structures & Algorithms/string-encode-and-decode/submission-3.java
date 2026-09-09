class Solution {
    // Encode: prefix each string with its length and a '#' delimiter
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // Decode: read the length, then slice exactly that many chars
    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++; // find delimiter
            int len = Integer.parseInt(str.substring(i, j)); // parse length
            String s = str.substring(j + 1, j + 1 + len); // slice payload
            res.add(s);
            i = j + 1 + len; // jump past this chunk
        }
        return res;
    }
}