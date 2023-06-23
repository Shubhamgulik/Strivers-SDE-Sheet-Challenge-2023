class Solution {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result=new ArrayList<List<String>>();
        char[][] board=new char[n][n];

        for(char[] row: board) Arrays.fill(row,'.');

        return helper(board,0,result,n);
    }

    public static List<List<String>> helper(char[][] board, int row, List<List<String>> result,int n){
        if(row >= n){
            List<String> ans=new ArrayList<>();

            for(int i=0; i<n; i++){
                String str=new String(board[i]); 
                ans.add(str);               
            }

            result.add(ans);

            return result;
        }

        for(int col = 0; col<n; col++){


            if(board[row][col] != 'Q'){
               
                if(isSafe(board,row,col,n)){
                    board[row][col] = 'Q';
                    helper(board,row+1,result,n);
                    board[row][col] = '.';
                }

            }
        }

        return result;
    }



    public static boolean isSafe(char[][] board, int row, int col, int n){
        int i=row;
        int j=col;

        while(i>=0 && j>=0){
            if(board[i--][j--] == 'Q') return false;
        }

        i = row;
        j = col;

        while(i >= 0){
            if(board[i--][j] == 'Q') return false;
        }

        i = row;
        while(i >= 0 && j < n){
            if(board[i--][j++] == 'Q') return false;
        }

        return true;
    }
}