class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 1; i < s.length(); i++) {
            //System.out.println("sum += " + ((int)s.charAt(i) - (int)s.charAt(i - 1)));
            sum += Math.abs((int)s.charAt(i) - (int)s.charAt(i - 1)); 
        }
        return sum;
    }
}