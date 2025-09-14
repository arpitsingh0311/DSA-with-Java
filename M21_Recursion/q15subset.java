// package M21_Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class q15subset {
    
    static ArrayList<String> arr = new ArrayList<>();
    public static void printSubsets(int i,String s,String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1,s,ans);  //not take
        printSubsets(i+1,s,ans+ch); //take
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Print subset of a String.

        arr =new ArrayList<>();  //reset
        String s = "abcdef";
        printSubsets(0,s,"");
        System.out.println(arr);

//Leetcode 78 subsets

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



    }
}
