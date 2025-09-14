public class L10_Diameter {
    public static void main(String[] args) {
        
// Ques-7-) Leetcode 543(Easy) Diameter of a tree O[n] approach


// WITH GLOBAL VARIABLE

/*
class Solution {
    static int maxDia;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftLevels =levels(root.left);
        int rightLevels =levels(root.right);
        int dia = leftLevels + rightLevels;
        maxDia = Math.max(maxDia,dia);
        return 1 + Math.max(leftLevels,rightLevels);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0;
        levels(root);
        return maxDia;
    }
} 
*/



// WITHOUT GLOBAL VARIABLE


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
