class Solution {
    public boolean checkDivisibility(int n) {
        int origNumber = n; // Keep a copy of n to check divisibility at the end
        int sum = 0;
        int prod = 1; // Initialize product to 1

        // Loop through all digits
        while (n > 0) {
            int ones = n % 10;
            n = n / 10;

            sum += ones;
            prod *= ones;
        }

        int total = sum + prod;

        // Check for division by zero and actual divisibility using modulo (%)
        return total != 0 && origNumber % total == 0;
    }
}