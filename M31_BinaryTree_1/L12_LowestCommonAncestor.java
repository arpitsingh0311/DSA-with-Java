public class L12_LowestCommonAncestor {
    public static void main(String[] args) {
        
// Ques-15-) Leetcode - 236(Medium)  Lowest Common Ancestor of a Binary Tree.

/*
class Solution {
    public boolean exists(TreeNode root, TreeNode node){
        if(node==root) return true;
        if(root==null) return false;
        return exists(root.left,node) || exists(root.right,node);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        boolean pLiesInLST = exists(root.left,p);
        boolean qLiesInLST = exists(root.left,q);
        if(pLiesInLST==true && qLiesInLST==true) return lowestCommonAncestor(root.left,p,q);
        if(pLiesInLST==false && qLiesInLST==false) return lowestCommonAncestor(root.right,p,q);
        // if(pLiesInLST==true && qLiesInLST==false) return root;
        // if(pLiesInLST==false && qLiesInLST==true) return root;
        else return root;
    }
} 
*/





    }
}
