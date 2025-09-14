package M21_Recursion;
import java.util.Scanner;

public class questions {
    // Ques-1-)
    public static int fact(int n){
        if(n==1 || n==0) return 1;
        int ans = n * fact(n-1);
        return ans;
    }

    //Ques-2-)
    public static void nToOne(int n) {
        if(n==0) return;
        System.out.print(n + " ");
        nToOne(n-1);
    }

    //Ques-3-)
    public static void oneToN(int x,int n){
        if(x>n) return;
        System.out.print(x + " ");
        oneToN(x+1,n);
    }

    //Ques-4-)
    public static void increasing(int n){
        if(n==0) return;
        increasing(n-1);
        System.out.print(n + " ");
    }

    //Ques-5-)
    public static void sum(int n,int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        sum(n-1,s+n);
    }

    //Ques-6-)
    public static int sumreturn(int n){
        if(n==0 || n==1) return 1;
        return n + sumreturn(n-1);
    }

    //Ques-7-)
    public static int power(int a, int b){    // TC = O(b)
        if(a==0 && b==0) {
            System.out.println("Not defined");
            return -1;
        }
        if(b==0) return 1;
        return a * power(a,b-1);
    }


    //Ques-8-)
    public static int powlog(int a, int b){ // TC = O(logb)
        if(b==0) return 1;
        int ans = powlog(a,b/2);
        if(b%2==0) return ans * ans;
        else return ans * ans * a;
    }

    //Ques-9-)
    public static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
 

    // Ques-10-) Stair path
    public static int stair(int n){
        if(n<=2) return n;
        return stair(n-1) + stair(n-2);
    }


    // Ques-11-) Maze path    (Given a m*n grid you have to reach from top left corner to bottom right corner.you can go either down or right at a time.Find the no. of paths )
    public static int maze(int row, int col, int m, int n){
        if(row==m || col==n ) return 1; 
        int rightWays = maze(row,col+1,m,n); 
        int downWays = maze(row+1,col,m,n); 
        return rightWays + downWays;
    }
    public static int maze2(int m, int n){
        if(m==1 || n==1 ) return 1; 
        int rightWays = maze2(m,n-1); 
        int downWays = maze2(m-1,n); 
        return rightWays + downWays;
    }


    // Ques-12-)
    public static void pip(int n){
        if(n == 0) return;
        System.out.print(n);  // pre
        pip(n-1);
        System.out.print(n);  // in
        pip(n-1);
        System.out.print(n);  // post
    }

    // Ques-13-)
    public static void print(int i, int[] arr){
        if(i== arr.length) return;
        System.out.print(arr[i] + " ");
        print(i+1,arr);
    }

    // Ques-14-) Remove all occurances of a from string.
    public static void removea(int i,String s, String ans){
        if(i==s.length()){
            System.out.print(ans);
            return;
        }
        if(s.charAt(i)!='a') ans += s.charAt(i);
        removea(i+1,s,ans);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ques-1-) Make a function which calculates the factorial of n using recursion.
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(fact(n));*/


        //Ques-2-) print n to 1 using recursion.
        /*int n = sc.nextInt();
        nToOne(n);*/

        // Ques-3-) Print 1 to n (extra parameter) using recursion.
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        oneToN(1,n);*/

        //Ques-4-) Print 1 to n (after recursive call)
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        increasing(n);*/


        // Ques-5-)Print sum from 1 to n (Parameterised)
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        sum(n,0);*/


        //Ques-6-) Print sum from 1 to n (Return type)
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(sumreturn(n));*/


        //Ques-7-)Make a function which calculates 'a' raised to the power 'b' using recursion.
        /*System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println(power(a,b));*/

        
        //Ques-8-)Power function(logarithmic)
        /*System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println(powlog(a,b));*/

        
        //Ques-9-) Write a function to calculate the nth fibonacci number using recursion.
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));*/


       // Ques-10-) Stair path
    //    Leetcode 70(Easy) but with use of DP Climbing Stairs
        /*System.out.print("Enter number of stairs : "); 
        int n =  sc.nextInt();
        System.out.println(stair(n));*/


        //Ques-11-) Maze path    (Given a m*n grid you have to reach from top left corner to bottom right corner.you can go either down or right at a time.Find the no. of paths )
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m,n));*/


        //Ques-12-)Print zig-zag  pre-in-post
        // input = 3  output = 321112111232111211123
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        pip(n);*/


        //Ques-13-) Print all elements of an array.
        /*int[] arr = {4,9,4,6,4,2,3,8,9,1,5,6,2,3,7,8,9,5,2,0,1,6};
        print(0,arr);*/

        //Ques-14-) Remove all occurances of 'a' from string.
        /*String s = "Arpit Singh Studing in NIT Srinagar";
        removea(0,s,"");*/


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


        //Ques-20-)Leetcode 38(Medium) Count and say

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




    }
}