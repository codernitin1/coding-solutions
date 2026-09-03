class Solution {
    int count=1;
    void f(int n){
        if(count>n)return ;
        
            System.out.print(count+" ");
            count++;
            f(n);
        
    }
    public void printTillN(int n) {
        f(n);
        
    }
}