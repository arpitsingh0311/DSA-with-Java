public class L7toL8_Traversal {
    public static void main(String[] args) {
        
// Ques-8-) Leetcode 144(Easy) Binary Tree Preorder Traversal

/*
class Solution {
    public void preorder(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }
} 
*/


// Ques-9-) Leetcode 94(Easy) Binary Tree Inorder Traversal

/*
class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }
} 
*/


// Ques-10-) Leetcode 145(Easy) Binary Tree Postorder Traversal

/*
class Solution {
    public void postorder(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        postorder(root.left,ans);
        postorder(root.right,ans);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        postorder(root, ans);
        return ans; 
    }
} 
*/


    }
}
