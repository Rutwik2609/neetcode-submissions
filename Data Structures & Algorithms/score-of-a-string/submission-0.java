class Solution {
    public int scoreOfString(String s) {
        int i=0;
        int j=1;
        int n=s.length();
        int score=0;
        while(i<n && j<n){
            int diff = Math.abs(s.charAt(j)-s.charAt(i));
            score+=diff;
            i+=1;
            j+=1;
        }
        return score;
    }
}