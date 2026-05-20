

class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> res = new ArrayList<>();

        while (i < str.length()) {
            // 1) find the delimiter '#'
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            // 2) parse the length
            int len = Integer.parseInt(str.substring(i, j));

            // 3) extract the string of that length
            int start = j + 1;
            int end = start + len;
            res.add(str.substring(start, end));

            // 4) move index forward
            i = end;
        }

        return res;
    }
}
