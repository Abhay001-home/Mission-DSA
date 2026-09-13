class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int leftPtr = 0;
        int rightPtr = m*n - 1;
        while(leftPtr <= rightPtr){
            int mid = leftPtr + ( rightPtr - leftPtr ) / 2;
            int row = mid / n;
            int col = mid % n;
            int key = matrix[row][col];

            if( key == target ){
                return true;
            }else if( key < target){
                leftPtr = mid + 1;
            }else{
                rightPtr = mid - 1;
            }
        }
        return false;
    }
}