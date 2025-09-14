public class L11_DiameterOfBinaryTree {
    public static void main(String[] args) {
        
// Ques-14-) Leetcode - 543(Easy) Diameter of Binary Tree.

// Diameter  == Largest Path

// Very slow but it can fast using DP

/*
class Solution {
    public int levels(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans = Math.max((levels(root.left)+levels(root.right)),Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
        return ans;
    }
} 
*/


// more clear 

/*
class Solution {
    public int levels(TreeNode root, int[] maxDia){
        if(root==null) return 0;
        int leftLevels =levels(root.left,maxDia);
        int rightLevels =levels(root.right,maxDia);
        int dia = leftLevels + rightLevels;
        maxDia[0] = Math.max(maxDia[0],dia);
        return 1 + Math.max(leftLevels,rightLevels);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxDia = {0};
        levels(root,maxDia);
        return maxDia[0];
    }
}
*/






    }
}
