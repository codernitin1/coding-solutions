class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int Fmax = arr.length;
        int max = arr[0];
        for(int i=0;i<Fmax;i++){
            if(arr[i]<=max){
                return i;
            }
        }
        return 1;
    }
}