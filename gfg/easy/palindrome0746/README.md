# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer `n`. Your task is to find if it is a palindrome.

 **Examples:** 

```
Input: n = 555
Output: true
Explanation: The number 555 reads the same backward as forward, so it is a palindrome.
```

```
Input: n = 123
Output: false
Explanation: The number 123 reads differently backward (321), so it is not a palindrome.
```

```
Input: n = -121
Output: true
Explanation: if number is palindrome, mainly ignore sign.
```

 **Constraints:** 
-109 ≤ n ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T03:55:26.003Z  

```java

class Solution {
    public boolean isPalindrome(int x) {
        x=Math.abs(x);
        int count = x;
        int rev = 0;
        while (x!=0){
            int lastdight =x%10;
            rev = rev*10+lastdight;
            x = x/10;
        }
        if(count<0) return false ;
        if(count == rev){
            return true;
        }else return false ;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/palindrome0746/1)