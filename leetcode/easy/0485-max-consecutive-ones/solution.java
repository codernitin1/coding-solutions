class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp=0;
        int maxcount=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i] ==1){
                maxcount++;
            }else{
              maxcount=0;  
            }
            if(maxcount>temp)temp=maxcount;
        }
        return temp;
    }
}