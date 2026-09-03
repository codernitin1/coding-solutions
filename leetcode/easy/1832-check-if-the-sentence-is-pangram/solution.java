class Solution {
    public boolean checkIfPangram(String str) {
        
        boolean[] arr=new boolean[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']=true;
        }
        boolean ans=true;
        for(int i=0;i<arr.length;i++){
            ans=ans && arr[i];
        }
        return ans;
    }
}