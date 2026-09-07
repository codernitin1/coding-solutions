# Print n to 1 Without Loop

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Print numbers from  **n to 1**  (space separated) without the help of loops.

 **Examples :** 

```
Input: n = 10
Output: 10 9 8 7 6 5 4 3 2 1
```

 **Constraints :** 
1 ≤ n ≤ 1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T15:28:07.131Z  

```java
class Solution {
    void printNos(int n) {
        // code here
        for(int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-n-to-1-without-loop/1)