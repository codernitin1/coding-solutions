class Solution {
    static boolean isPrime(int n) {
        // code here
        int temp =0;
        if(n==1) return false;
        
        for(int i=1;i<=n/2;i++){
            if(n%i == 0){
                temp++;
            }
        }
        if(temp>1)return false;
        else return true;
    }
}