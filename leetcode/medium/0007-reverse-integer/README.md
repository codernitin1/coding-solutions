# Reverse Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a signed 32-bit integer `x`, return `x` *with its digits reversed*. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-231, 231 - 1]`, then return `0`.

 **Assume the environment does not allow you to store 64-bit integers (signed or unsigned).** 

 

 **Example 1:** 

```
Input: x = 123
Output: 321

```

 **Example 2:** 

```
Input: x = -123
Output: -321

```

 **Example 3:** 

```
Input: x = 120
Output: 21

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.98%)  
**Memory:** 42.6 MB (beats 63.76%)  
**Submitted:** 2026-09-01T04:45:45.115Z  

```java
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

```

---

[View on LeetCode](https://leetcode.com/problems/reverse-integer/)