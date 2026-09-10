class Solution {
    static int sumOfDigits(int n) {
        // code here
       int sum = 0;
        while (n > 0) {
            sum += n % 10;   // Extract the last digit
            n = n / 10;      // Remove the last digit
        }
        return sum;
    }
}
