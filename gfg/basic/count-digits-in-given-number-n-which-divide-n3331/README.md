# Digits in N that Divide it

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a  **non-negative**  integer  **s**  represented as a string, count the number of digits in s that divide the number represented by s.

A digit is considered valid only if it is non-zero and the number represented by s is  **divisible**  by that digit.

If a digit appears multiple times in s, each occurrence should be counted separately.

 **Examples:** 

```
Input: s = "35"
Output: 1
Explanation: The digit 5 divides 35, but the digit 3 does not. So the answer is 1.
```

```
Input: s = "1122324"
Output: 7
Explanation: Every digit in "1122324" divides 1122324. So the answer is 7.
```

 **Constraints:** 
1 ≤ |s| ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T03:04:09.654Z  

```java
class Solution {
    public int divisibleByDigits(String s) {
        int n = s.length();
        int[] rem = new int[10];
        for (int i = 0; i < n; i++) {
            int digitVal = s.charAt(i) - '0';
            for (int d = 1; d <= 9; d++) {
                rem[d] = (rem[d] * 10 + digitVal) % d;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int digitVal = s.charAt(i) - '0';
            if (digitVal != 0 && rem[digitVal] == 0) {
                count++;
            }
        }

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-digits-in-given-number-n-which-divide-n3331/1)