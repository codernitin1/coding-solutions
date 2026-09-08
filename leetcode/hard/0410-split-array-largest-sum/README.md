# Split Array Largest Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an integer array `nums` and an integer `k`, split `nums` into `k` non-empty subarrays such that the largest sum of any subarray is  **minimized**.

Return  *the minimized largest sum of the split*.

A  **subarray**  is a contiguous part of the array.

 

 **Example 1:** 

```
Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.

```

 

 **Constraints:** 

- 1 <= nums.length <= 1000
- 0 <= nums[i] <= 106
- 1 <= k <= min(50, nums.length)

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-09-08T04:18:20.795Z  

```java

class Solution {
    public int splitArray(int[] arr, int k) {
        // code here
        int m = arr.length-1;
        int sum = 0;

       if(k > arr.length){
           return -1;
       }
       long low = 0;
       long high = 0;

       for(int page:arr){
           low = Math.max(low,page);
           high += page;
       }
       long ans = 0;

       while(low <= high){
           long mid  =  low + (high - low)/2;
           if(ispossible(arr, k, mid)){
               ans = mid;
               high = mid - 1;
           }else {
               low = mid +1;
           }
       }
           return (int)ans;
    }
    private boolean ispossible(int []arr , int k, long maxpages ){
        int student = 1;
        long curpage =0;

        for(int pages:arr){
            if(curpage + pages <= maxpages){
                curpage +=pages;
            }else{
                student++;
                curpage = pages;

                if(student > k) return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/split-array-largest-sum/)