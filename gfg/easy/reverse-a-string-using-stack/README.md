# Reverse Using Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string **s**, the task is to reverse the string using stack.

 **Examples:** 

```
Input: s ="GeeksforGeeks"
Output:  skeeGrofskeeG

```

```
Input: s ="Geek"
Output: keeG
```

 **Constraints:** 
1 ≤ s.length() ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:26:45.625Z  

```java
class Solution {
    public String reverse(String S) {
        // code here
        
        return new StringBuilder(S).reverse().toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1)