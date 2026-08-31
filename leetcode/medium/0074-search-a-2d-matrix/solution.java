class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
      int n =matrix[0].length;
      int s = 0;
      int e = m*n-1;
      while(s<=e){
        int mid=(s+e)/2;
        int midVal = matrix[mid/n][mid%n];
        if(midVal==target){
            return true;
        }else if(midVal<target){
            s=mid+1;
        }else{
            e=mid-1;
        }
      }
      return false;
    }
}