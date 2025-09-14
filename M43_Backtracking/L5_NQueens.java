// package M43_Backtracking;

public class L5_NQueens {
    
// Ques-6-) Leetcode-51(Hard) N Queens

/*
class Solution {
    public boolean isSafe(char[][] arr,int row,int col){
        int n=arr.length;
        // check row
        for(int j=0;j<n;j++){
            if(arr[row][j]=='Q') return false;
        }
        // check col
        for(int i=0;i<n;i++){
            if(arr[i][col]=='Q') return false;
        }
        // check north-east
        int i = row, j=col;
        while(i>=0 && j<n){
            if(arr[i][j]=='Q') return false;
            i--;j++;
        }
        i = row; j=col;
        while(i<n && j<n){
            if(arr[i][j]=='Q') return false;
            i++;j++;
        }
        i = row; j=col;
        while(i>=0 && j>=0){
            if(arr[i][j]=='Q') return false;
            i--;j--;
        }        
        i = row; j=col;
        while(i<n && j>=0){
            if(arr[i][j]=='Q') return false;
            i++;j--;
        }
        return true;
    }
    public void nqueen(char[][] board,int row,List<List<String>> ans){
        int n=board.length;
        if(row==n){
            // convert char[][] into list of string
            List<String> l = new ArrayList<>();
            for(int i=0;i<n;i++){
                String s = "";
                for(int j=0;j<n;j++){
                    s+=board[i][j];
                }
                l.add(s);
            }
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nqueen(board,row+1,ans);
                board[row][j] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(board[i],'.');
        nqueen(board,0,ans);
        return ans;
    }
}
*/

// Ques-7-) Leetcode 52(Hard) N Queens II

// METHOD-1 (JUST COPY PAST)

/*
class Solution {
    public boolean isSafe(char[][] arr,int row,int col){
        int n=arr.length;
        // check row
        for(int j=0;j<n;j++){
            if(arr[row][j]=='Q') return false;
        }
        // check col
        for(int i=0;i<n;i++){
            if(arr[i][col]=='Q') return false;
        }
        // check north-east
        int i = row, j=col;
        while(i>=0 && j<n){
            if(arr[i][j]=='Q') return false;
            i--;j++;
        }
        i = row; j=col;
        while(i<n && j<n){
            if(arr[i][j]=='Q') return false;
            i++;j++;
        }
        i = row; j=col;
        while(i>=0 && j>=0){
            if(arr[i][j]=='Q') return false;
            i--;j--;
        }        
        i = row; j=col;
        while(i<n && j>=0){
            if(arr[i][j]=='Q') return false;
            i++;j--;
        }
        return true;
    }
    public void nqueen(char[][] board,int row,List<List<String>> ans){
        int n=board.length;
        if(row==n){
            // convert char[][] into list of string
            List<String> l = new ArrayList<>();
            for(int i=0;i<n;i++){
                String s = "";
                for(int j=0;j<n;j++){
                    s+=board[i][j];
                }
                l.add(s);
            }
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nqueen(board,row+1,ans);
                board[row][j] = '.';
            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(board[i],'.');
        nqueen(board,0,ans);
        return ans.size();
    }
}
*/




// METHOD-2

/*
class Solution {
    public boolean isSafe(char[][] arr,int row,int col){
        int n=arr.length;
        // check row
        for(int j=0;j<n;j++){
            if(arr[row][j]=='Q') return false;
        }
        // check col
        for(int i=0;i<n;i++){
            if(arr[i][col]=='Q') return false;
        }
        // check north-east
        int i = row, j=col;
        while(i>=0 && j<n){
            if(arr[i][j]=='Q') return false;
            i--;j++;
        }
        i = row; j=col;
        while(i<n && j<n){
            if(arr[i][j]=='Q') return false;
            i++;j++;
        }
        i = row; j=col;
        while(i>=0 && j>=0){
            if(arr[i][j]=='Q') return false;
            i--;j--;
        }        
        i = row; j=col;
        while(i<n && j>=0){
            if(arr[i][j]=='Q') return false;
            i++;j--;
        }
        return true;
    }
    public void nqueen(char[][] board,int row,int[] ans){
        int n=board.length;
        if(row==n){
            ans[0]++;
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nqueen(board,row+1,ans);
                board[row][j] = '.';
            }
        }
    }
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(board[i],'.');
        int[] ans={0};
        nqueen(board,0,ans);
        return ans[0];
    }
}
*/

}
