class Solution {

     List<List<String>> res = new ArrayList<>();

    public boolean issafe(char board[][], int row , int col){

        // diagonally up
        for(int i = row-1; i>=0 ; i--){
            if(board[i][col] == 'Q')
                return false;
        }
        
        // vertically left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q')
                return false;
        }
        
          // vertically right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q')
                return false;
        }
        
        return true;
    }

     public List<String> construct(char[][] board){
        List<String> rowadd = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String row = new String(board[i]);
            rowadd.add(row);
        }
        return rowadd;
    }

    public void nqueens(char board[][] , int row, List<List<String>> res){

       if(row == board.length){
             res.add(construct(board));
            return;
        }

        for(int j=0; j<board.length; j++){
            if(issafe(board, row, j)){
                board[row][j] = 'Q';
                nqueens(board, row+1, res);
                board[row][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

       char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        nqueens(board,0, res); 
        return res;      
    }


}