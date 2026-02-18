class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col = matrix[0].length;
        int start=0;
        int end=row*col-1;
        int mid=0;
        //int midCol=0;

        int x=0;
        int y=0;


        while(start<=end){
            mid=start+(end-start)/2 ;
            x=mid/col;
            y=mid%col;
            if(target==matrix[x][y]){
                return true;
            }
            else if (target<matrix[x][y]){
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return false;
    }
}