class Solution {
    public int reverseDegree(String s) {
        int revResult = 0;

        for(int i = 1;i<=s.length(); i++){
            revResult = revResult + (26 -(s.charAt(i-1) - 'a')) * i;
        }
        return revResult;
    }
}