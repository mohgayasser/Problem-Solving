class Solution {
    public boolean Smallsearch(int[] matrix,int l, int r, int target) {
       
        if(l<=r){
            int mid = l + (r - l) / 2;
            if(matrix[mid] == target) return true;
            else if (matrix[mid] > target) return Smallsearch(matrix, l, mid-1, target);
            else if (matrix[mid] < target) return Smallsearch(matrix, mid+1, r, target);
         }
        
            return false ;
    }
   
    public boolean searchMatrix(int[][] matrix, int target) {
        int mid = (matrix.length-1)/2;
        if( matrix[mid][0]==target)
            return true;
        else if (matrix[mid][0]>target){
            for(int i = 0; i < matrix.length/2; i++){
                boolean result = Smallsearch(matrix[i], 0, matrix[i].length-1, target);
                if(result) return true;
            }

        }else if (matrix[mid][0]<target){
            for(int i = matrix.length/2; i < matrix.length; i++){
                 boolean result = Smallsearch(matrix[i], 0, matrix[i].length-1, target);
                if(result) return true;
            }
        }
        return false;
    }
}
