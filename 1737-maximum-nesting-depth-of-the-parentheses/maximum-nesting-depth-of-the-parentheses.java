class Solution {
    public int maxDepth(String s) {
        int result = 0;
        int bracket = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                bracket++;
            }else if(s.charAt(i) == ')'){
                bracket--;
            }
            result = Math.max(result, bracket);
        }   
        return result;
    }
}