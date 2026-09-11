class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        
         for(int i =1;i<nums.length-1;i++){
            nums[i]=nums[i-1]+nums[i];
            if(nums[nums.length-1]<=nums[i]){
                nums[nums.length-1]+=nums[i];
                return nums;
            }
            else if(nums[nums.length-1]>=nums[i]){
                nums[i]=nums[i-1]+nums[i];
                return nums;
            }
         }
         return nums;
    }
}