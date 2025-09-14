// package M14_MultidimentionalArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ques {

    public static void print(int arr[][]){
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<=i;j++){
                l.add(1);
            }
            ans.add(l);
        }
        for(int i=2;i<n;i++){
            for(int j=1;j<=i-1;j++){
                ans.get(i).set(j,ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ques-1-) Write a program to store roll number and marks obtained by 4 students side by side in a matrix.
        /*System.out.print("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.print("ewnter no. of columns : ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){ 
                System.out.print("Enter element ("+i+","+j+") : ");
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int[] ele:matrix){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }*/

        // Ques-2-) Lasgent element in 2D array

        /*System.out.print("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.print("ewnter no. of columns : ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){ 
                System.out.print("Enter element ("+i+","+j+") : ");
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int[] ele:matrix){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum vaue : "+max);*/

        // Ques-3-)Sum of all elements in 2D matrix

        /*System.out.print("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.print("ewnter no. of columns : ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){ 
                System.out.print("Enter element ("+i+","+j+") : ");
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int[] ele:matrix){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        int sum =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);*/



        // Ques-4-) Addition of two matrix.

        /*System.out.print("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int n = sc.nextInt();
        System.out.println("Enter matrix 1 ");
        int[][] matrix1 = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){ 
                System.out.print("Enter element ("+i+","+j+") : ");
                matrix1[i][j]= sc.nextInt();
            }
        }
        for(int[] ele:matrix1){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("Enter matrix 2");
        int[][] matrix2 = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){ 
                System.out.print("Enter element ("+i+","+j+") : ");
                matrix2[i][j]= sc.nextInt();
            }
        }
        for(int[] ele:matrix2){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of matrix");
        int[][] sum_matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int[] ele:sum_matrix){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }*/

        // Ques-5-) Transpose of a matrix using new matrix

        /*System.out.print("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int n = sc.nextInt();
        System.out.println("Enter matrix 1 ");
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){ 
                System.out.print("Enter element ("+i+","+j+") : ");
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int[] ele:matrix){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        int[][] transpose = new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        for(int[] ele:transpose){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }*/

        // Ques-6-) Transpose of a matrix without using new matrix.

        /*int[][]  matrix = {{92, 45, 21, 77, 68},{56, 89, 33, 55, 73},{18, 67, 42, 10, 27},{61, 58, 46, 84, 38},{51, 63, 17, 95, 70}};
        print(matrix);
        System.out.println();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        print(matrix);
        */

        // Ques-7-)write a program to rotate a matrix by 90 degree.

        /*System.out.print("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter matrix ");
        int[][] matrix = new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){ 
                System.out.print("Enter element ("+i+","+j+") : ");
                matrix[i][j]= sc.nextInt();
            }
        }
        print(matrix);
        // transpose
        System.out.println("Transpose");
        for(int i=0;i<m;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }
        print(matrix);
        // rotate --> reverse each row
        System.out.println("Rotated by 90°");
        for(int i=0;i<m;i++){
            int a =0, b=m-1;
            while(a<b){
            // swap matrix[i][a] and matrix[i][b]
            int temp = matrix[i][a];
            matrix[i][a] = matrix[i][b];
            matrix[i][b] =temp;
            a++;
            b--;}
        }
        print(matrix);*/


        // Ques-8-) Write a program to print the matrix in wave form

        /*System.out.print("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int n = sc.nextInt();
        System.out.println("Enter matrix ");
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){ 
                System.out.print("Enter element ("+i+","+j+") : ");
                matrix[i][j]= sc.nextInt();
            }
        }
        print(matrix);
        // wave print 
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(matrix[i][j] + " ");
                }
            } else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }*/


        // Ques-9-) Write a program to print matrix in spiral form.


        /*System.out.print("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int n = sc.nextInt();
        System.out.println("Enter matrix ");
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){ 
                System.out.print("Enter element ("+i+","+j+") : ");
                matrix[i][j]= sc.nextInt();
            }
        }
        
        print(matrix);
        int minr=0, maxr=m-1, minc=0, maxc=n-1;
        
        
        while(minr<=maxr && minc<=maxc){
            for(int j=minc;j<=maxc;j++){
                System.out.print(matrix[minr][j]+ " ");         
            }
            minr++;
            if(minr>maxr || minc>maxc) break;
            for(int i=minr;i<=maxr;i++){
                System.out.print(matrix[i][maxc]+ " ");   
            }
            maxc--;
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc;j>=minc;j--){
                System.out.print(matrix[maxr][j]+ " ");
            }
            maxr--;
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr;i>=minr;i--){
                System.out.print(matrix[i][minc]+ " ");  
            }
            minc++;
        }*/



        // Ques-10-) Given an integer 'numRows', generate Pascal's triangle.

        /*int n = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    row.add(1); // First and last element of each row is 1
                } else {
                    // Middle elements are sum of two elements from the row above
                    row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
            }
            ans.add(row);
        }
        // Print Pascal's triangle
        for(List<Integer> row : ans) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }*/
        



        // Ques-11-) Multiplication of two matrix.


        /*System.out.println("Enter matrix 1 ");
        System.out.print("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){ 
                System.out.print("Enter element ("+i+","+j+") : ");
                a[i][j]= sc.nextInt();
            }
        }
        for(int[] ele:a){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("Enter matrix 2");
        System.out.print("Enter no. of rows : ");
        int p = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int q = sc.nextInt();
        int[][] b = new int[p][q];
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){ 
                System.out.print("Enter element ("+i+","+j+") : ");
                b[i][j]= sc.nextInt();
            }
        }
        for(int[] ele:b){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of both matrixes : ");
        if(n==p){
            int c[][] = new int[m][q];
            for(int i=0; i<c.length;i++){
                for(int j=0;j<c[0].length;j++){
                    for(int k=0;k<b.length;k++){
                        c[i][j] += (a[i][k]) * (b[k][j]);
                    }
                }   
            }
            print(c);
        } else{
            System.out.println("Matrix multiplication not possible ");
        }*/
        

        // ques-12-) Leetcode 861(Med) Score after flipping matrix.

        
        /*int[][] arr = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int m= arr.length, n = arr[0].length;
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0) arr[i][j] =1;
                    else arr[i][j] =0;
                }
            } 
        } 
        for(int j=1;j<n;j++){
            int noz =0, noo =0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0) noz++;
                if(arr[i][j]==1)noo++;
            }
            if(noz>noo){
                for(int i=0;i<m;i++){
                    if(arr[i][j]==0) arr[i][j] =1;
                        else arr[i][j] =0;
                }
            }
        }
        int score =0;
        int x=1;
        for(int j=n-1;j>=0;j--){
            for(int i=0;i<m;i++){
                score+= (arr[i][j]*x);
            }
            x *= 2;
        }   
        System.out.println(score);*/


        // Ques.-13-) Leetcode 240(Medium)  Search in a 2D Matrix - II 

        // method 1-) very time consuming and inefficient
        
        /*int arr[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = sc.nextInt();
        boolean ans = false; 
        int m=arr.length, n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==target) ans = true;
            }
        }
        System.out.println(ans);*/

        // method-2-) more effiecient 

        /*class Solution {
            public boolean searchMatrix(int[][] arr, int x) {
                int m = arr.length, n = arr[0].length;
                int i=0, j=n-1;
                while(i<m && j>=0){
                    if(arr[i][j]<x) i++;
                    else if(arr[i][j]>x) j--;
                    else return true;
                }
                return false;
            }
        }*/


        // Ques-14-) Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.


        // method -2-)

        /*int m= arr.length, n=arr[0].length;  
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
                    arr[i][j] =0;
                }
            }
        }
        for(int j=0;j<n;j++){
            if(col[j]==true){
                for(int i=0;i<m;i++){
                    arr[i][j] =0;
                }
            }
        }*/

        // method -3-) using constant  extra space

        /*class Solution {
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
















    }


    

    

}
