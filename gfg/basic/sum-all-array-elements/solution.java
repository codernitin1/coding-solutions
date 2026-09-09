class Solution {
    public int arraySum(int arr[]) {
        // code here
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum = arr[i]+(sum);
        }
        return sum;
    }
}
