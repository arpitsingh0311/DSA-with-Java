public class L11_BSTtoGST {
    public static void main(String[] args) {
        

// Ques-6-) BST to Greater Sum Tree

/*
class Solution {

    public void inorder(TreeNode root, List<TreeNode> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }

    public TreeNode bstToGst(TreeNode root) {
        List<TreeNode> arr = new ArrayList<>();
        inorder(root,arr);
        int n = arr.size();
        for(int i=n-2;i>=0;i--){
             arr.get(i).val += arr.get(i+1).val;
        }
        return root;
    }
}
*/




    }
}
