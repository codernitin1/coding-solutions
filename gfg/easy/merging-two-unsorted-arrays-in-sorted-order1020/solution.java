class Solution {
    public int[] sortedMerge(int[] a, int[] b) {
        // code here
        
        int [] ans = new int[a.length + b.length];
        
        int idx=0;
        
        
        for(int i=0; i<a.length;i++){
            ans[idx++] = a[i];
        }
        
        for(int i=0; i<b.length;i++){
            ans[idx++] = b[i];
        }
        
        Arrays.sort(ans);
        return ans;
        
    }
}



