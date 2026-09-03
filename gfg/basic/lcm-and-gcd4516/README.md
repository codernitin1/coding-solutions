# LCM And GCD

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers a and b, You have to compute their LCM and GCD and return an array containing their LCM and GCD.

 **Examples:** 

```
Input: a = 5, b = 10
Output: [10, 5]
Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
```

```
Input: a = 14, b = 8
Output: [56, 2]
Explanation: LCM of 14 and 8 is 56, while their GCD is 2.

```

```
Input: a = 1, b = 1
Output: [1, 1]
Explanation: LCM of 1 and 1 is 1, while their GCD is 1.
```

 **Constraints:** 
1 ≤ a, b ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T02:45:28.605Z  

```java
class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
       int x = a;
       int y = b;
       
       while(y!=0){
           int rem = x % y;
           x = y;
           y = rem;
       }
       int gcd = x;
       
       int lcm = (a * b) / gcd;
       int []result = {lcm, gcd};
       return  result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1)