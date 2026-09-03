class Solution {
    public static long sumOfDivisors(long n) {
        // code here
        int temp =0;
        
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
               if(i%j==0){
                   temp+=j;
               }
            }
        }
        return temp;
    }
}