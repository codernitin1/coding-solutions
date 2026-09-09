class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int odd=0;
        int even=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                odd++;
            }else{
                even++;
            }
        }
         return new int[]{even, odd};
    }
}