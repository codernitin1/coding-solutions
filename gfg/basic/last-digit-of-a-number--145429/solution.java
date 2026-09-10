import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        n = Math.abs(n); 
        int b = n%10;
        System.out.print(b);
        
    }
}