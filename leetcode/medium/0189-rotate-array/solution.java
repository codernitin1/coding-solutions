class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] oldNums = nums.clone();

        for (int i = 0; i < n; i++) {
            int newPosition = (i + k) % n;
            nums[newPosition] = oldNums[i];
        }
    }
}
