public class L8_ValidSudoku {

    
// Ques-10-) Leetcode 36(Medium) Valid Sudoku

/*
class Solution {
    public boolean isValid(char[][]board, int row,int col,char num){
        // check row
        for(int j=0;j<9;j++){
            if(board[row][j]==num) return false;
        }
        // check col
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        // check 3x3 grid
        int sr = row/3 *3;
        int sc = col/3 *3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
                board[i][j] = ',';
                if(num!='.' && isValid(board,i,j,num)==false) return false;
                board[i][j] = num;
            }
        }
        return true;
    }
}
*/


}
