class Solution {
    public void setZeroes(int[][] matrix) {


        int row=matrix.length;
        int col= matrix[0].length;

        // int newMatrix[row][col];

        int[] r = new int[row];
        int[] c = new int[col];




        for(int i=0;i < row ;i++){
            for(int j=0; j < col ;j++){
                if(matrix[i][j]==0){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }


        for(int i=0;i < row ;i++){
            for(int j=0; j < col ;j++){
                if(r[i]==1 || c[j]==1){
                    matrix[i][j]=0;
                }
            }
        }

        //  for(int k=0;k<col;k++){
        //                 matrix[i][k]=0;
        //             }
        //             for(int k=0;k<row;k++){
        //                 matrix[k][j]=0;
        //             }
        //         }
        //         if(j<col){
        //              j=col+1;
        //         }
        //         if(i<row){
        //                 i=row+1;
        //         }
    }
}