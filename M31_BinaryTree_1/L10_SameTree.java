public class L10_SameTree {
    public static void main(String[] args) {
        
// Ques-12-) Leetcode - 100(Easy)  Same Tree

/*
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val) return false;
        if(!isSameTree(p.left,q.left)) return false;
        if(!isSameTree(p.right,q.right)) return false;
        return true;
    }
}
*/



// Ques-13-) Leetcode - 101(Easy)  Symmetric Tree.

/*
class Solution {
    public void invert(TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val) return false;
        if(!isSameTree(p.left,q.left)) return false;
        if(!isSameTree(p.right,q.right)) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        invert(root.right);
        return isSameTree(root.left,root.right);


    }
} 
*/


    }
}
