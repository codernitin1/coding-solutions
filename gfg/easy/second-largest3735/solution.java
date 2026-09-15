class Solution {
    public int getSecondLargest(int[] arr) {
        int max = -1;
        int secMax = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }

        return secMax;
    }
}