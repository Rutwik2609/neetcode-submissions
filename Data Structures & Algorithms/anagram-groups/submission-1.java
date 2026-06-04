class Solution {
    public static String createKey(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                sb.append(i).append("#").append(arr[i]);
            }
        }
        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] arr = new int[26];
            for(char ch : s.toCharArray()){
                arr[ch-'a']++;
            }
            String key = createKey(arr);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                List<String> res = new ArrayList<>();
                res.add(s);
                map.put(key,res);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String s : map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }


}
