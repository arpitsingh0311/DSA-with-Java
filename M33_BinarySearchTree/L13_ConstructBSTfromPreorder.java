public class L13_ConstructBSTfromPreorder {
    public static void main(String[] args) {
        
// Ques-9-) Leetcode 1008 (Medium) Construct BST from preorder traversal


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

    public TreeNode bstFromPreorder(int[] preorder) {
        int[] inorder = new int[preorder.length];
        for(int i=0;i<preorder.length;i++){
            inorder[i] = preorder[i];
        }        
        Arrays.sort(inorder);
        return helper(preorder, inorder,0,preorder.length-1,0,inorder.length-1);
    }
}
*/




    }
}
