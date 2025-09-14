public class L11_PathSum_II {
    public static void main(String[] args) {

// Ques-8-) Leetcode 113(Medium) Path Sum II


/*
class Solution {
    public void helper(TreeNode root, int target,List<Integer> arr, List<List<Integer>> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(root.val==target){
                arr.add(root.val);
                ans.add(arr);
            }
            return;
        }
        arr.add(root.val);
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.addAll(arr);
        arr2.addAll(arr);
        helper(root.left,target-root.val,arr1,ans);
        helper(root.right,target-root.val,arr2,ans);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<Integer>();
        helper(root,targetSum,arr,ans);
        return ans;
    }
}
*/


    }
}
