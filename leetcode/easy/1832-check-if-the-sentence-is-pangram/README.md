# Check if the Sentence Is Pangram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **pangram**  is a sentence where every letter of the English alphabet appears at least once.

Given a string `sentence` containing only lowercase English letters, return `true` *if* `sentence` *is a  **pangram**, or* `false` *otherwise.* 

 

 **Example 1:** 

```
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

```

 **Example 2:** 

```
Input: sentence = "leetcode"
Output: false

```

 

 **Constraints:** 

- 1 <= sentence.length <= 1000
- sentence consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 63.13%)  
**Memory:** 42.3 MB (beats 99.48%)  
**Submitted:** 2026-09-03T02:31:42.725Z  

```java
class Solution {
    public boolean checkIfPangram(String str) {
        
        boolean[] arr=new boolean[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']=true;
        }
        boolean ans=true;
        for(int i=0;i<arr.length;i++){
            ans=ans && arr[i];
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)