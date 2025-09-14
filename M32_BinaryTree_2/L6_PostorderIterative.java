public class L6_PostorderIterative {
    public static void main(String[] args) {
        

// Ques-3-) Leetcode 145(Easy) Binary Tree Postorder Traversal (Iterative)       

// postorder  left right root
// reverse of (reverse preorder i.e, root right left)

/*
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root!=null) st.push(root);
        while(st.size()>0){
            TreeNode top = st.pop();
            ans.add(top.val);
            if(top.left!=null) st.push(top.left);
            if(top.right!=null) st.push(top.right);
        }
        Collections.reverse(ans);
        return ans; 
    }
} 
*/









    }
}
