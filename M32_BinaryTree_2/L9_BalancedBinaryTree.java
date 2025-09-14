public class L9_BalancedBinaryTree {
    public static void main(String[] args) {
        
// Ques-6-) Leetcode 110(Easy) Balanced Binary Tree


// bruteforce approach


/* 
class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int diff = Math.abs(levels(root.left)-levels(root.right));
        if(diff>1) return false;
        // boolean lst = isBalanced(root.left);
        // if(lst==false) return false;
        // boolean rst = isBalanced(root.right);
        // if(rst==false) return false;
        // return true;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
*/



// Optimized


/*
class Solution {
    static boolean ans;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftLevels =levels(root.left);
        int rightLevels =levels(root.right);
        int diff = Math.abs(leftLevels-rightLevels);
        if(diff>1) ans = false;
        return 1 + Math.max(leftLevels,rightLevels);
    }
    public boolean isBalanced(TreeNode root) {
        ans =true;
        levels(root);
        return ans;
    }
}
*/



// WITHOUT USING GLOBAL VARIABLE

/*
class Solution {
    static boolean ans;
    public int levels(TreeNode root, boolean[] ans){
        if(root==null) return 0;
        int leftLevels =levels(root.left,ans);
        int rightLevels =levels(root.right,ans);
        int diff = Math.abs(leftLevels-rightLevels);
        if(diff>1) ans[0] = false;
        return 1 + Math.max(leftLevels,rightLevels);
    }
    public boolean isBalanced(TreeNode root) {
        boolean[] ans ={true};
        levels(root,ans);
        return ans[0];
    }
}
*/




    }
}
