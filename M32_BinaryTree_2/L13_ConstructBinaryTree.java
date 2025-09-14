public class L13_ConstructBinaryTree {
    public static void main(String[] args) {
        
// Ques-10-) Leetcode 105(Medium)  Construct Binary Tree from Preorder and Inorder Traversal

/*
class Solution {
    public TreeNode helper(int[] preorder, int[] inorder,int prelo,int prehi,int inlo,int inhi) {
        if(prelo>prehi && inlo>inhi) return null;
        TreeNode root = new TreeNode(preorder[prelo]);
        int r=0;
        while(inorder[r]!=preorder[prelo]) r++;
        int leftsize = r-inlo;
        root.left = helper(preorder,inorder,prelo+1,prelo+leftsize,inlo,r-1);
        root.right = helper(preorder,inorder,prelo+leftsize+1,prehi,r+1,inhi);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder,inorder,0,n-1,0,n-1);
    }
} 
*/


// Ques-11-) Leetcode 106(Medium) Construct Binary Tree from inorder and postorder.





    }
}
