// package M21_Recursion;

public class q16permutations {

    public static void permutations(String ans, String s){
        if(s.length()==0){
           System.out.print(ans + " ");
           return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            permutations(ans+ch,left+right);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        permutations("",s);


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




    }
}
