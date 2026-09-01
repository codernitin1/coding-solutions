class Solution {
    public boolean isPalindrome(int x) {
        
        int count = x;
        int rev = 0;
        while (x!=0){
            int lastdight =x%10;
            rev = rev*10+lastdight;
            x = x/10;
        }
        if(count<0) return false ;
        if(count == rev){
            return true;
        }else return false ;
    }
}