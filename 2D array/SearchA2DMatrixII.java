class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row=matrix.length;
        int col=matrix[0].length;

        int i=0;
        int j=col-1;

        int val=0;

        while(j>=0 && i<row ){
            //val=matrix[i][j];
            if(matrix[i][j]==target){
                return true;
            }
            else if(target>matrix[i][j]){
                i++;
            }else
                j--;
        }
        return false;
    }
}