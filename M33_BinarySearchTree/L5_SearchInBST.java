public class L5_SearchInBST {
    public static void main(String[] args) {
        


// Ques-1-) Leetcode 700(Easy) Search in a Binary Search Tree.

/*
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val<val && root.right!=null) return searchBST(root.right,val);
        if(root.val>val && root.left!=null) return searchBST(root.left,val);
        if(root.val==val)return root;
        else return null;
    }00.
}
*/


// Ques-2-) Leetcode 938(Easy) Range Sum of BST


/*
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int sum = 0;
        if (root.val >= low && root.val <= high) sum += root.val;
        if (root.val > low) sum += rangeSumBST(root.left, low, high);
        if (root.val < high) sum += rangeSumBST(root.right, low, high);
        return sum;
    }
}
*/





    }    
}
