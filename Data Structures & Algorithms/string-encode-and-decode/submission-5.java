class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            for(char ch : s.toCharArray()){
                sb.append(ch-'a').append('#');
            }
            sb.append('_');
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='_'){
                res.add(sb.toString());
                sb.replace(0, sb.length(), "");
                continue;
            }
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int n = Integer.parseInt(str.substring(i,j));
            char ch = (char) (n + 'a');
            sb.append(ch);
            i=j;
        }
        return res;
    }
}
