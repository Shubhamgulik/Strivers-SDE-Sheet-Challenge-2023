// method 1

class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int m = a.length;
        int n = a[0].length;
        
        int i = 0, j = n-1;
        while(i<m && j>=0 ){
            if(target > a[i][j])
                i++;
            else if(target < a[i][j])
                j--;
            else
                return true;
        }
        return false;
    }
}

// Method 2

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        if(matrix.length == 0) return false;
        int n = matrix.length; 
        int m = matrix[0].length; 
        int hi = (n * m) - 1;
        
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            if(matrix[mid/m][mid % m] == target) {
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return false;
    }
}