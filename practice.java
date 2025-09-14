import java.util.Scanner;

public class practice {

    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return true;
        return false;
    }

    public static void print2D(int[][] arr){
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    
    public static void reverse(StringBuilder sb, int i , int j){
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; j--;
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        /****************************************************************************************************/
        /******************************************* M13 :> ARRAYS ******************************************/
        /****************************************************************************************************/

       


        // Ques-1-) Given an array of marks of students, if the marks of any student is less than 35 print its roll number.
        /* 
        int[] arr = {8,89,56,24,15,35,48,56};
        int target = 35;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<target) 
            System.out.print(i+1 + " ");
        }
        */


        // ques-2-) Linear Search
        //          Find the element 'x' in the array. Take array and x as input.
        /*int[] arr = {89,65,4,5,9,4,5,26,5,4,5};
        int x = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("Target found");
                break;
            }
        }*/

        // ques-3-)Find the maximum value out of all the elements in the array.
        /*int[] arr = {8,89,56,24,15,35,48,56};
        int max = Integer.MIN_VALUE;
        for(int ele:arr){
            if(ele>max) max = ele;
        }
        System.out.println(max);*/


        // ques-4-)Find the min value out of all the elements in the array.
        /*int[] arr = {8,89,56,24,15,35,48,56};
        int min = Integer.MAX_VALUE;
        for(int ele:arr){
            if(ele<min) min = ele;
        }
        System.out.println(min);*/

        // Ques-5-) Find the second largest element in the given array.
        
        /*int[] arr = {8,89,56,24,15,35,48,56};
        int max = Integer.MIN_VALUE;
        for(int ele:arr){
            if(ele>max) max = ele;
        }
        int sm = Integer.MIN_VALUE;
        for(int ele:arr){
            if(ele != max){
                sm = Math.max(sm,ele);
            }
        }
        System.out.println(sm);*/

        // Ques-6-)find the doublet in the array whose sum is equal to the given value x.

        /*int[] arr = {8,89,56,24,15,35,48,56};
        int x = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }*/

        // Ques-7-) Write a program to reverse the array without using any extra array.

        // Method - 1 using temp 
        /*int[] arr = {8,89,56,24,15,35,48,56};
        for(int i=0;i<arr.length/2;i++){
            int j = arr.length-1-i;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
        }
        for(int ele:arr){
            System.out.print(ele + " ");
        }*/

        // Method - 2 using two pointer
        /*int[] arr = {8,89,56,24,15,35,48,56};
        int i=0,j=arr.length-1;
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele + " ");
        }*/

        // Ques-8-) Rotate the given array 'a' by k steps , where k is non -negative without using extra array.

        /*class Solution {
            public void swap(int[] arr, int i, int j){
                while(i<j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;j--;
                }
            }
            public void rotate(int[] arr, int k) {
                int n = arr.length;
                k = k % n;
                swap(arr,0,n-1);
                swap(arr,0,k-1);
                swap(arr,k,n-1); 
            }
        }*/

        // Ques-9-) sort array of 0's and 1's.

        // int[] arr = {0,1,0,0,1,1,0,0,0};
        /*int noz=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) noz++;
        }
        for(int i=0;i<arr.length;i++){
            if(i<noz) arr[i] = 0;
            else arr[i]=1;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }*/

        /*int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j) break;
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;j--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }*/

        // Ques-11-) Leetcode 88(Easy) Merge two sorted arrays.

        /*class Solution {
            public void merge(int[] nums1, int m, int[] nums2, int n) {
                int i=m-1, j=n-1, k=m+n-1;
                while(i>=0 && j>=0){
                    if(nums1[i]>nums2[j]){
                        nums1[k] = nums1[i];
                        i--;
                    } else{
                        nums1[k] = nums2[j];
                        j--;
                    }
                    k--;
                }
                while(j >= 0){
                    nums1[k] = nums2[j];
                    j--;
                    k--;
                }
            }
        }*/


        // ques-12-) next greatest element

        /*int arr[] = {12,8,41,37,2,49,16,28,21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        for(int i=0;i<n-1;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                max = Math.max(max,arr[j]);
            }
            ans[i]=max;
        }
        for(int ele : ans){
            System.out.print(ele + " ");
        }
        int ng = arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i] = ng;
            ng = Math.max(ng,arr[i]);
        }
        for(int ele:ans){
            System.out.print(ele + " ");
        }*/





        /****************************************************************************************************/
        /******************************** M14 :> MULTIDIMENTIONAL ARRAYS ************************************/
        /****************************************************************************************************/






        // Ques-1-) Write a program to store roll number and marks obtained by 4 students side by side in a matrix.
        // Ques-2-) Lasgent element in 2D array
        // Ques-3-)Sum of all elements in 2D matrix
        // Ques-4-) Addition of two matrix.
        // Ques-5-) Transpose of a matrix using new matrix

        /*int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print2D(arr);
        int[][] t = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                t[i][j] = arr[j][i];
            }
        }
        print2D(t);*/

        // Ques-6-) Transpose of a matrix without using new matrix.

        /*int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print2D(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print2D(arr);*/

        // Ques-7-)write a program to rotate a matrix by 90 degree.

        /*int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print2D(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            int j=0, k=arr[i].length-1;
            while(j<k){
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++;k--;
            }
        }
        print2D(arr);*/

        // Ques-8-) Write a program to print the matrix in wave form

        /*int[][]  arr = {{92, 45, 21, 77, 68},{56, 89, 33, 55, 73},{18, 67, 42, 10, 27},{61, 58, 46, 84, 38},{51, 63, 17, 95, 70}};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[i].length;j++) System.out.print(arr[i][j] + " ");
            } else {
                for(int j=arr[i].length-1;j>=0;j--) System.out.print(arr[i][j] + " ");
            }
        }*/

        // Ques-9-) Write a program to print matrix in spiral form.


/*class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length, n = arr[0].length;
        int minr = 0, minc=0, maxr=m-1, maxc= n-1;
        while(minr<=maxr && minc<=maxc){
            for(int j=minc;j<=maxc;j++) ans.add(arr[minr][j]);
            minr++;
            if(minr>maxr || minc>maxc) break;        
            for(int i=minr;i<=maxr;i++) ans.add(arr[i][maxc]);
            maxc--;
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc;j>=minc;j--) ans.add(arr[maxr][j]);
            maxr--;
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr;i>=minr;i--) ans.add(arr[i][minc]);
            minc++;            
        }
        return ans;
    }
}*/

// Ques-10-) Given an integer 'numRows', generate Pascal's triangle.

/*class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    row.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }
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
            int[][] c = new int[m][q];
            for(int i=0;i<m;i++){
                for(int j=0;j<q;j++){
                    for(int k=0;k<n;k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            for(int[] ele:c){
                for(int x:ele){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Matrix multiplication is not possible");
        }*/


        // ques-12-) Leetcode 861(Med) Score after flipping matrix.

        /*class Solution {
            public int matrixScore(int[][] arr) {
                int m = arr.length, n = arr[0].length;
                for(int i=0;i<m;i++){
                    if(arr[i][0] == 0){
                        for(int j=0;j<n;j++){
                            if(arr[i][j]==0) arr[i][j] = 1;
                            else arr[i][j] = 0;
                        }
                    } 
                }
                for(int j=1;j<n;j++){
                    int one=0, zero = 0;
                    for(int i=0;i<m;i++){
                        if(arr[i][j] == 0) zero++;
                        else one++;
                    }
                    if(zero>one){
                        for(int i=0;i<m;i++){
                            if(arr[i][j]==0) arr[i][j] = 1;
                            else arr[i][j] = 0;
                        }
                    }
                }
                int score = 0;
                int base = 1;
                for(int j=n-1;j>=0;j--){
                    for(int i=0;i<m;i++){
                        score += (arr[i][j])*base;
                    }
                    base *= 2;
                }
                return score;
            }
        }*/

        // Ques-13-) Leetcode 240(Medium) Search in a 2D Matrix - II

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

        // Ques-14-) Leetcode 73 (Medium) Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

        /*class Solution {
            public void setZeroes(int[][] arr) {
                int m = arr.length, n = arr[0].length;
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
                            arr[i][j]=0;
                        }
                    }
                }
                for(int j=0;j<n;j++){
                    if(col[j]==true){
                        for(int i=0;i<m;i++){
                            arr[i][j]=0;
                        }
                    }
                }
            }
        }*/

        /*class solution {
            public void setZeroes(int[][] arr) {
                int m = arr.length, n = arr[0].length;
                boolean row = false, col = false;
                // Check for the row
                for(int j=0;j<n;j++){
                    if(arr[0][j]==0){
                        row=true;
                        break;
                    }
                }
                // Check for the col
                for(int i=0;i<m;i++){
                    if(arr[i][0]==0){
                        col = true;
                        break;
                    }
                }
                // use the first row and col to mark zeroes
                for (int i = 1; i < m; i++) {
                    for (int j = 1; j < n; j++) {
                        if (arr[i][j] == 0) {
                            arr[i][0] = 0;
                            arr[0][j] = 0;
                        }
                    }
                }
                for(int i=1;i<m;i++){
                    if(arr[i][0]==0){
                        for(int j=1;j<n;j++){
                            arr[i][j]=0;
                        }
                    }
                }
                for(int j=1;j<n;j++){
                    if(arr[0][j]==0){
                        for(int i=1;i<m;i++){
                            arr[i][j]=0;
                        }
                    }
                }
                if(row){
                    for(int j=0;j<n;j++){
                        arr[0][j]=0;
                    }
                }
                if(col){
                    for(int i=0;i<m;i++){
                        arr[i][0]=0;
                    }
                }
            }
        }*/




        /****************************************************************************************************/
        /******************************** M-15 & 16 :> STRINGS AND STRINGBUILDERS ***************************/
        /****************************************************************************************************/





        // Ques-1-) Input a string and count all the vowels in the given string.

        /*System.out.print("Enter String : ");
        String s = sc.nextLine();
        int count = 0;
        for(int i=0;i<s.length();i++) if(isVowel(s.charAt(i))) count++;
        System.out.println(count);*/

        // Ques-2-) Input a string and print all the substring of that string.

        /*System.out.print("Enter String : ");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i, j) + " ");
            }
        }*/

        // Ques-3-) Take integer input and convert it into a string.

        /*int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s);*/

        // Ques-4-) Return the total number of digits in a number without using loop.

        /*int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s.length());*/
 
        // Ques-5-) Input a string and Update all the even positions in the string to character 'a'. Consider 0-basedindexing.

        /*String s = sc.next();
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(i%2==0) ans += "a";
            else ans += s.charAt(i);
        }*/

        // Ques-6-) Input a string and toggle all the characters of it.(Replace all small case with capital case and vice versa)

        /*StringBuilder sb = new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            int x = (int)ch;
            if(x>=65 && x<=90){
                x += 32;
                ch = (char)x;
                sb.setCharAt(i,ch);
            } else if(x>=97 && x<=122){
                x -= 32;
                ch = (char)x;
                sb.setCharAt(i,ch);                
            }
        }
        System.out.println(sb);*/

        // Ques-7-)Reverse each word in the given sentence.

        /*StringBuilder sb = new StringBuilder(sc.nextLine());
        int i=0,j=0,n=sb.length();
        while(j<n){
            if(sb.charAt(j) != ' ') j++;
            else{
                reverse(sb,i,j-1);
                i = j+1;
                j=i;
            }
        }
        reverse(sb,i,j-1);
        System.out.println(sb);*/

        // Ques-8-) Given two strings s and t, return true if t is an anagram of s and false otherwise.

/*class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<s.length();i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}*/

        // Ques-9-) Given a string consisting of lowercase English alphabets.PRint the character that is occuring most number of times. 

        /*String s = sc.next();
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            int idx = (int)s.charAt(i) - 97;
            freq[idx]++;
        }
        int max = Integer.MIN_VALUE;
        int max_idx = -1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max = freq[i];
                max_idx = i;
            }

        }
        System.out.println((char)(max_idx+97));*/

        // Ques-10-) Leetcode 205(Easy) Given two strings s and t, determine if they are isomorphic (They can consists any valid character)

        // Ques-11-) Given n string consisting of digits from 0 to 9. Return the string which has maximum value.

        // Quees-12-) Leetcode 442(Medium) Compress the given string.

        /*class Solution {
            public int compress(char[] arr) {
                StringBuilder ans = new StringBuilder("");
                int i=0, j=0;
                while(j<arr.length){
                    if(arr[j]==arr[i]) j++;
                    else{
                        ans.append(arr[i]);
                        int len = j-i;
                        if(len>1) ans.append(len);
                        i=j;
                    }
                }
                ans.append(arr[i]);
                int len = j-i;
                if(len>1) ans.append(len);
                for(int k=0;k<ans.length();k++){
                    arr[k] = ans.charAt(k);
                }
                return ans.length();
            }
        }*/



        /****************************************************************************************************/
        /*********************************** M-18 :> BASIC SORTING ALGORITHM  *******************************/
        /****************************************************************************************************/




        // Bubble Sort

        /*int[] arr = {5,4,3,2,1};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag = true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }*/

        // Ques-1-) Leetcode 283(Easy) Push zeroes to the end while maintaining the relative order of other elements.

        /*class Solution {
            public void moveZeroes(int[] arr) {
                int n = arr.length;
                int noz = 0;
                for(int i=0;i<n;i++){
                    if(arr[i]==0) noz++;
                }
                for(int i=0;i<noz;i++){
                    for(int j=0;j<n-1;j++){
                        if(arr[j]==0){
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                }
            }
        }*/

        // Selection Sort

        /*int[] arr = {3,5,2,1,4};
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int m_idx = -1;
            int min = Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    m_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[m_idx];
            arr[m_idx] = temp;
        }
        for(int ele:arr){
            System.out.print(ele + " ");
        }*/

        // Insertion Sort

        // int[] arr = {3,5,2,1,4};
        /*int[] arr = {5,4,3,2,1};
        int n = arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]) swap(arr,j,j-1);
                else break;
            }
        }
        for(int ele:arr){
            System.out.print(ele + " ");
        }*/


        /****************************************************************************************************/
        /**************************************** M-19 :> BINARY SEARCH *************************************/
        /****************************************************************************************************/



        //Ques-1-)Binary Search

        /*class Solution {
            public int search(int[] arr, int target) {
                int n = arr.length;
                int low=0, high=n-1;
                while(low<=high){
                    int mid = low + (high-low)/2;
                    if(arr[mid]==target) return mid;
                    else if(arr[mid]<target) low= mid+1;
                    else high=mid-1;
                }
                return -1;
            }
        }*/

        // Ques-2-) Given a sorted array and an integer 'x',find the lower bound of x. Smallest index such that    arr[index] >=x.

        /*int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int lb = n;
        int low=0, high=n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=target){
                lb = Math.min(lb,mid);
                high = mid-1;
            } else low = mid+1;
        }
        System.out.println(lb);*/

        //Ques-3-)Given an sorted integer array and an integer 'x'. Upper bound is the minimum index such that arr[index]>x.

        /*int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int ub = n;
        int low=0, high=n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>target){
                ub = Math.min(ub,mid);
                high = mid-1;
            } else low = mid+1;
        }
        System.out.println(ub);*/

        // Ques-4-) Leetcode 34(Medium) Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. 


        /*class Solution {
            public int[] searchRange(int[] arr, int target) {
                int[] ans = {-1,-1};
                int n = arr.length;
                int lo=0 , hi=n-1;
                boolean flag = false;
                while(lo<=hi){
                    int mid = lo + (hi-lo)/2;
                    if(target>arr[mid]) lo = mid+1;
                    else if(target<arr[mid]) hi = mid-1;
                    else if(target==arr[mid]){
                        flag=true;
                        break;
                    } 
                }
                if(flag==false) return ans;
                int lb=n;
                lo=0; hi=n-1;
                while(lo<=hi){
                    int mid = lo+(hi-lo)/2;
                    if(arr[mid]>=target){
                        lb= Math.min(mid,lb);
                        hi = mid-1;
                    } else lo = mid+1;
                }
                int ub=n;
                lo=0; hi=n-1;
                while(lo<=hi){
                    int mid = lo+(hi-lo)/2;
                    if(arr[mid]>target){
                        ub= Math.min(mid,ub);
                        hi = mid-1;
                    } else lo = mid+1;
                }
                ans[0] = lb;
                ans[1] = ub-1;
                return ans;
            }
        }*/

        //Ques-5-) Leetcode 852(Medium) Peak index in a mountain array. 

        /*class Solution {
            public int peakIndexInMountainArray(int[] arr) {
                int n = arr.length;
                int low=1, high=n-2;
                while(low<=high){
                    int mid = low + (high-low)/2;
                    if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
                    else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low = mid+1;
                    else high = mid-1;
                }
                return -1;
            }
        }*/

        //Ques-6-) Leetcode-69(Easy) Sqrt(x)  

        /*class Solution {
            public int mySqrt(int x) {
                long lo=0, hi=(long) x;
                while(lo<=hi){
                    long mid = lo + (hi-lo)/2;
                    if(mid*mid==(long)x) return (int)mid;
                    else if(mid*mid < (long)x) lo = mid+1;
                    else hi = mid-1;
                }
                return (int)hi;
            }
        }*/

        //Ques-7-) Leetcode 33(Medium) Search in Rotated sorted array. 

        /*class Solution {
            public static int pivot(int[] arr) {
                int n = arr.length;
                int lo = 0, hi = n - 1;
                while (lo < hi) {
                    int mid = lo + (hi - lo) / 2;
                    if (arr[mid] > arr[hi]) {
                        lo = mid + 1; // Pivot is in the right part
                    } else {
                        hi = mid; // Pivot is in the left part
                    }
                }
                return lo; // Pivot index
            }
            public int Bsearch(int[] arr, int target,int low,int high) {
                int n = arr.length;
                while(low<=high){
                    int mid = low + (high-low)/2;
                    if(arr[mid]==target) return mid;
                    else if(arr[mid]<target) low= mid+1;
                    else high=mid-1;
                }
                return -1;
            }
            public int search(int[] arr, int target) {
                int p = pivot(arr);
                if (target >= arr[p] && target <= arr[arr.length - 1]) {
                    return Bsearch(arr, target, p, arr.length - 1); // Right part
                } else {
                    return Bsearch(arr, target, 0, p - 1); // Left part
                }
            }
        }*/
        /*class Solution {
            public int search(int[] arr, int target) {
                int n =arr.length;
                int lo=0,hi=n-1;
                while(lo<=hi){
                    int mid = lo + (hi-lo)/2;
                    if(arr[mid]==target) return mid;
                    else if(arr[mid]<=arr[hi]){
                        if(target>arr[mid] && target<=arr[hi]) lo = mid+1;
                        else hi=mid-1;
                    } else{
                        if(target>=arr[lo] && target<arr[mid]) hi = mid-1;
                        else lo=mid+1;                
                    }
                }
                return -1;
            }
        }*/


        //Ques-8-)  Leetcode 658(Medium) Find K closest elements.   

/*class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n=arr.length;
        if(x<arr[0]){
            for(int i=0;i<k;i++){
                ans.add(arr[i]);
            }
            return ans;
        }
        if(x>arr[n-1]){
            for(int i=n-1;i>=n-k;i--){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }
        int lb=n;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=x){
                lb=mid;
                hi=mid-1;
            } else lo=mid+1;
        }
        int i=lb-1, j=lb;
        while(k>0 && i>=0 && j<=n-1){
            int di = Math.abs(x-arr[i]);
            int dj = Math.abs(x-arr[j]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
            } else{
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while(i<0 && k>0){
            ans.add(arr[j]);
            j++;
            k--;
        }
        while(j>=n && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}*/

    // Ques-9-)  Leetcode  1283(Medium) Find the smallest Divisor given a Threshold.     

    /*class Solution {
        public boolean isLess(int[] arr,int mid, int t){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%mid==0) sum+=arr[i]/mid;
                else sum += arr[i]/mid + 1;
            }
            if(sum<=t) return true;
            else return false;
        }
        public int smallestDivisor(int[] arr, int threshold) {
            int n = arr.length;
            int mx = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                mx = Math.max(mx,arr[i]);
            }
            int d=1;
            int lo=1,hi=mx;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if(isLess(arr,mid,threshold)){
                    d=mid;
                    hi=mid-1;
                } else lo=mid+1;
            }
            return d;
        }
    }*/


    //Ques-10-) Leetcode 1011(Medium) Capacity to ship packages within

    /*class Solution {
        public boolean isPossible(int c, int[] arr, int d){
            int n = arr.length;
            int load = 0;
            int days = 1; 
            for(int i=0;i<n;i++){
                if(load + arr[i] <=c) load += arr[i];
                else{
                    load = arr[i];
                    days++;
                }
            }
            if(days>d) return false;
            else return true;
        }
        public int shipWithinDays(int[] arr, int d) {
            int n = arr.length;
            int sum = 0, mx = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                mx = Math.max(mx,arr[i]);
                sum += arr[i];
            }
            int minC = sum;
            int lo = mx, hi = sum;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if(isPossible(mid,arr,d) == true){
                    minC = mid;
                    hi = mid-1;
                }
                else lo = mid+1;
            }
            return minC;
        }
    }*/


    //Ques-11) Leetcode 2064(Medium) Minimized Maximum of products distributed to any store.

    /*class Solution {
        public boolean isPossible(int maxQ, int n, int[] arr){
            int stores = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%maxQ == 0) stores += arr[i]/maxQ;
                else stores += arr[i]/maxQ + 1;
            }
            if(stores > n) return false;
            else return true;
        }
        public int minimizedMaximum(int n, int[] arr) {
            int m = arr.length;
            int mx = Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                mx = Math.max(mx,arr[i]);
            }
            int lo=1, hi=mx;
            int Ans =0;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2 ;
                if(isPossible(mid,n,arr)==true){
                    Ans = mid;
                    hi = mid-1;
                } 
                else lo = mid+1;
            }
            return Ans;
        }
    }*/


    //Ques-12-) Leetcode 1539(Medium) kth Missing positive number

    /*class Solution {
        public int findKthPositive(int[] arr, int k) {
            int lo=0,hi=arr.length-1;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                int missed = arr[mid] - (mid+1);
                if(missed<k) lo=mid+1;
                else hi=mid-1;
            }
            return k+hi+1;
        }
    }*/




        /****************************************************************************************************/
        /***************************************** M-21 :> RECURSION ****************************************/
        /****************************************************************************************************/



        // Ques-10-) Stair path
        //    Leetcode 70(Easy) but with use of DP Climbing Stairs

        /*class Solution {
            public int Stairs(int n, int[] dp){
                if(n<=2) return n;
                if(dp[n] != -1) return dp[n];
                dp[n] = Stairs(n-1,dp) + Stairs(n-2,dp);
                return dp[n];
            }
            public int climbStairs(int n) {
                int[] dp = new int[n+1];
                for(int i=0;i<dp.length;i++){
                    dp[i]=-1;
                }
                return Stairs(n,dp);
            }
        }*/

        //Ques-11-) Maze path  
        
        /*class Solution {
            public int maze(int m,int n,int[][] dp){
                if(m==1||n==1) return 1;
                if(dp[m][n]!=-1) return dp[m][n];
                int rw = maze(m,n-1,dp);
                int cw = maze(m-1,n,dp);
                return dp[m][n] = rw+cw;
            }
            public int uniquePaths(int m, int n) {
                int[][] dp = new int[m+1][n+1];
                for(int i=0;i<m+1;i++){
                    for(int j=0;j<n+1;j++){
                        dp[i][j] = -1;
                    }
                }
                return maze(m,n,dp);
            }
        }*/

        //Ques-12-)Print zig-zag  pre-in-post
        
        /*public static void pip(int n){
            if(n==0) return;
            System.out.print(n);
            pip(n-1);
            System.out.print(n);
            pip(n-1);
            System.out.print(n);
        }
        public static void main(String[] args) {
            int n = 3;
            pip(n);
        }*/

        //Ques-14-) Remove all occurances of 'a' from string.

        /*public static void removea(int i,String s, String ans){
            if(i==s.length()){
                System.out.print(ans);
                return;
            }
            if(s.charAt(i)!='a') ans += s.charAt(i);
            removea(i+1,s,ans);
        }*/

        //Leetcode 78 Subsets

/*class Solution {
    public void ss(int i,int[] arr,List<Integer> a,List<List<Integer>> ans){
        if(i==arr.length){
            ans.add(new ArrayList<>(a));
            return;
        }
        a.add(arr[i]);
        ss(i + 1, arr, a, ans);
        a.remove(a.size() - 1); 
        ss(i + 1, arr, a, ans);
    }
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        ss(0,arr,a,ans);
        return ans;
    }
}*/

// Leetcode 46(Medium) Permutation

/*
class Solution {
    public void p(int i,int[] arr,List<Integer> a,List<List<Integer>> ans){
        if(a.size()==arr.length){
            ans.add(new ArrayList<>(a));
        }
        for(int j=0;j<arr.length;j++){
            if(a.contains(arr[j])) continue;
            a.add(arr[j]);
            p(i+1,arr,a,ans);
            a.remove(a.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        p(0,arr,a,ans);
        return ans;
    }
}
*/

// Leetcode 1979(Easy) Find Greatest Common Divisor of Array

/*class Solution {
    public int HCF(int a,int b){
        int temp=a%b;
        if(temp==0) return b;
        else return HCF(b,temp);
    }
    public int findGCD(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        return HCF(min,max);
    }
}*/

// Ques-18-)Leetcode 3211(Easy) Generate Binary Strings Without Adjacent Zero

/*class Solution {
    public void adjacent(int n, String s, List<String> ans){
        int m = s.length();
        if(m==n){
            ans.add(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='1'){
            adjacent(n,s+"0",ans);
            adjacent(n,s+"1",ans);
        } else{
            adjacent(n,s+"1",ans);
        }
    }
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        adjacent(n,"",ans);
        return ans;
    }
}*/

        //Ques-19-) Leetode 22(Medium) Generate paranthesis 

/*class Solution {
    public void p(int n,int open,int close,String s,List<String> ans){
        if(s.length()==n*2){
            ans.add(s);
            return;
        }
        if(open<n) p(n,open+1,close,s+"(",ans);
        if(close<open) p(n,open,close+1,s+")",ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        p(n,0,0,"",ans);
        return ans;
    }
}*/

        //Ques-20-)Leetcode 38 Count and say

        /*class Solution {
            public String countAndSay(int n) {
                if(n==1) return "1";
                String s = countAndSay(n-1);
                String ans = "";
                int i=0,j=0;
                while(j<s.length()){
                    if(s.charAt(i)==s.charAt(j)) j++;
                    else{
                        int l=j-i;
                        ans += l;
                        ans += s.charAt(i);
                        i=j;
                    }
                }
                int l=j-i;
                ans += l;
                ans += s.charAt(i);
                return ans;
            }
        }*/

    //    int count =0;
    //    int c1=0;
    //    for(int a=1;a<=6;a++){
    //     for(int b=1;b<=6;b++){
    //       for(int c=1;c<=6;c++){
    //         for(int d=1;d<=6;d++){
    //             for(int e=1;e<=6;e++){
    //                 for(int f=1;f<=6;f++){
    //                     int i=a+d-c;
    //                     int j= (b*b)-(e*e*e)+f;
    //                     c1++;
    //                     if(j%i==0) count++;
    //                 }
    //             }
    //         }
    //       }
    //     }
    //    }
    //    int ans = count/c1;
    //    System.out.println(ans);


    




















































































































































































































































































    }
}