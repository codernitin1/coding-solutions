class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
       int x = a;
       int y = b;
       
       while(y!=0){
           int rem = x % y;
           x = y;
           y = rem;
       }
       int gcd = x;
       
       int lcm = (a * b) / gcd;
       int []result = {lcm, gcd};
       return  result;
    }
}