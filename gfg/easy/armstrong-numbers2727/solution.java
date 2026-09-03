class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp =n;
        int sum = 0;
        
        while(temp!=0){
            int rem = temp%10;
            sum = (sum)+(rem*rem*rem);
            temp = temp/10;
        }
        if (sum == n){
            return true;
        }else return false ;
    }
}