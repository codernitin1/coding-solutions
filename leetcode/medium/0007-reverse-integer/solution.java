class Solution {
    public int reverse(int x) {
        int rev=0;
        while (x!=0){
            int lastdigit = x%10;
            x/=10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
                return 0;
            }
            // Check for potential negative underflow
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;
            }
            rev = rev*10+lastdigit;
        }
        return rev;
    }
}



// class Solution {
//     public int reverse(int x) {
//         int res = 0;
        
//         while (x != 0) {
//             int pop = x % 10; // Extract the last digit
//             x /= 10;          // Remove the last digit from x
            
//             // Check for potential positive overflow
//             if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > 7)) {
//                 return 0;
//             }
//             // Check for potential negative underflow
//             if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && pop < -8)) {
//                 return 0;
//             }
            
//             res = (res * 10) + pop;
//         }
        
//         return res;
//     }
// }
