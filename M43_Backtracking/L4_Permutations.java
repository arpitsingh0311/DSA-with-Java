// package M43_Backtracking;

public class L4_Permutations {
    
// Ques-5-) Leetcode 46(Medium) Permutations

// METHOD-1 (DONE BY ME) || (BETTER)

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

// METHOD -2 (BY SIR PW)

/*
class Solution {
    public void helper(int[] nums,List<Integer> ds,boolean[] isValid,List<List<Integer>> ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(isValid[i]==false){
                ds.add(nums[i]);
                isValid[i] = true;
                helper(nums,ds,isValid,ans);
                isValid[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];
        helper(nums,ds,isValid,ans);
        return ans;
    }
}
*/


// METHOD-3  (BEST)

/*
class Solution {
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void helper(int[] nums,int i,List<List<Integer>> ans){
        int n = nums.length;
        if (i == n) { 
            List<Integer> l = new ArrayList<>();
            for (int num : nums) {
                l.add(num);
            }
            ans.add(l);
            return;
        }
        for(int j=i;j<n;j++){
            swap(i,j,nums);
            helper(nums,i+1,ans);
            swap(i,j,nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);
        return ans;
    }
}
*/


}
