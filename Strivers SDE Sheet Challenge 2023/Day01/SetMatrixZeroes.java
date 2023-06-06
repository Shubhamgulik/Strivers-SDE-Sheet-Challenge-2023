// Method 1: 

class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix[0].length;
        int n = matrix.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0) fillZeroes(i,j,matrix);
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == (int)Math.pow(-10,9)){
                     matrix[i][j] = 0;
                }
            }
        }



    }

    public int[][] fillZeroes(int row, int column, int[][] matrix){
        for(int i=0; i<matrix[0].length; i++){
            if(matrix[row][i] != 0) matrix[row][i] = (int)Math.pow(-10,9);
        }
        for(int j=0; j<matrix.length; j++){
           if( matrix[j][column] != 0) matrix[j][column] = (int)Math.pow(-10,9);
        }
        return matrix;
    }
}

// Method 2:

class Solution {
    public void setZeroes(int[][] matrix) {
        
        int n = matrix[0].length;
        int m = matrix.length;

        int[] row = new int[m];
        int[] col = new int[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }



    }

    public int[][] fillZeroes(int row, int column, int[][] matrix){
        for(int i=0; i<matrix[0].length; i++){
            if(matrix[row][i] != 0) matrix[row][i] = (int)Math.pow(-10,9);
        }
        for(int j=0; j<matrix.length; j++){
           if( matrix[j][column] != 0) matrix[j][column] = (int)Math.pow(-10,9);
        }
        return matrix;
    }
}
