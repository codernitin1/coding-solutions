import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        
        int right = 0;
        int count = 0;
        int left = nums.length - 1; 
        
        while (right < left) {
            int sum = nums[left] + nums[right];
            
            if (sum == k) {
                count++;
                right++;
                left--;
            } else if (sum > k) {
                left--; 
            } else {
                right++;
            }
        }
        
        return count;
    }
}