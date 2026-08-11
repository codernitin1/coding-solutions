# Decision Making

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers,  **n**  and  **m**. The task is to check the relation between n and m. Print "less" if n < m,  "equal" if n == m, and "greater" if n > m.

**Examples :
**

```
Input: n = 4, m = 8
Output: lesser
Explanation: 4 < 8 so print 'less'.
```

```
Input: n = 8, m = 8
Output: equal
Explanation: 8 = 8 so print 'equal'.
```

```
Input: n = 8, m = 4
Output: greater
Explanation: 8 > 4 so print 'greater'.
```

 **Constraints:** 
-109 <= m, n <= 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T08:25:45.517Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // code here
        if(n<m){
            System.out.print("less");
        }else if(n>m){
            System.out.print("greater");
        }else{
            System.out.print("equal");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/decision-making/1)