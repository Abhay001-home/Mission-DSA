class Solution {
    public int smallestNumber(int n, int t) {
        int current = n;
        
        while (true) {
            int digitProduct = 1;
            String strNum = String.valueOf(current);
            
            for (int i = 0; i < strNum.length(); i++) {
                digitProduct *= strNum.charAt(i) - '0';
            }
            // Check if the product is divisible by t
            if (digitProduct % t == 0) {
                return current;
            }
            current++;
    }
}}