package M14_MultidimentionalArray;

public class SetMatrixZero {
    public static void main(String[] args) {
        
// METHOD - 1 USING O(m*n) EXTRA SPACE

/*
class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length; int n = arr[0].length;
        int[][] helper = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                helper[i][j] = arr[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(helper[i][j]==0){
                    for(int b=0;b<n;b++){
                        arr[i][b]=0;
                    }
                    for(int a=0;a<m;a++){
                        arr[a][j]=0;
                    }
                }
            }
        }
    }
}
*/


// METHOD - 2  USING O(m+n) EXTRA SPACE


/*
class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length; int n = arr[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(row[i]==true){
                for(int j=0;j<n;j++){
                    arr[i][j] = 0;
                }
            }
        }
        for(int j=0;j<n;j++){
            if(col[j]==true){
                for(int i=0;i<m;i++){
                    arr[i][j] = 0;
                }
            }
        }
    }
}   
*/


// METHOD - 3 USING CONSTANT EXTRA SPACE

/*
class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length; 
        int n = arr[0].length;
        boolean row = false, col = false;
        // Check if the first column needs to be set to zero
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                col = true;
                break;
            }
        }
        // Check if the first row needs to be set to zero
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                row = true;
                break;
            }
        }
        // Use the first row and column to mark zeros
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        // Set columns to zero based on markers
        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }
        // Set rows to zero based on markers
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        // Set the first row to zero if needed
        if (row) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }
        // Set the first column to zero if needed
        if (col) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }
}

*/


    }
}
