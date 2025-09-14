public class L9_ValidateBST {
    public static void main(String[] args) {
       
// Ques-4-) Leetcode 98(Medium)  Validate BST


// METHOD 1  USING MIN AND MAX FUNCTION


/*
class Solution {
    public static long Max(TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        return Math.max(root.val,Math.max(Max(root.left),Max(root.right)));
    }

    public static long Min(TreeNode root){
        if(root==null) return Long.MAX_VALUE;
        return Math.min(root.val,Math.min(Min(root.left),  Min(root.right)));
    }

    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        if(root.val<=Max(root.left)) return false;
        if(root.val>=Min(root.right)) return false;
        return isValidBST(root.left) && isValidBST(root.right); 
    }
}
*/

// METHOD-2 USING INORDER TRAVERSAL

/*
class Solution {
    public void inorder(TreeNode root, List<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> arr= new ArrayList<>();
        inorder(root,arr);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<=arr.get(i-1)) return false;
        }
        return true;
    }
}
*/

// Method -3-)  METHOD 1 BUT IN BETTER WAY

/*
class Solution {
    static boolean flag;

    public static long Max(TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        long leftMax = Max(root.left);
        if(leftMax>=root.val) flag= false;
        long rightMax = Max(root.right);
        return Math.max(root.val,Math.max(leftMax,rightMax));
    }

    public static long Min(TreeNode root){
        if(root==null) return Long.MAX_VALUE;
        long leftMin = Min(root.left);
        long rightMin = Min(root.right);
        if(rightMin<=root.val) flag = false;
        return Math.min(root.val,Math.min(leftMin, rightMin));
    }

    public boolean isValidBST(TreeNode root) {
        flag = true;
        Max(root);
        Min(root);
        return flag;
    }
}
*/







    }
}
