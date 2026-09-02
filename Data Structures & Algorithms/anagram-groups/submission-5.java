class Solution {

    public static String createKey(String s){
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                sb.append(i).append('*').append(arr[i]).append('#');
            }
        }
        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> map = new HashMap<>();

        for(String s : strs){
            String key = createKey(s);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                ArrayList<String> as = new ArrayList<>();
                as.add(s);
                map.put(key,as);
            }
        }

        return new ArrayList<>(map.values());
    }
}
