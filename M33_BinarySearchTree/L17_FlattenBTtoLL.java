public class L17_FlattenBTtoLL {
    public static void main(String[] args) {
        
// Ques-14-) Leetcode 114(Medium) Flatten Binary Tree to Linked List

// METHOD-1 USING ARRAYLIST OF PREORDER

/*
class Solution {
    public void preorder(TreeNode root, List<TreeNode> pre){
        if(root==null) return;
        pre.add(root);
        preorder(root.left,pre);
        preorder(root.right,pre);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> pre = new ArrayList<>();
        preorder(root,pre);
        for(int i=0;i<pre.size();i++){
            if(i!=pre.size()-1)pre.get(i).right = pre.get(i+1);
            pre.get(i).left = null;
        }
    }
}
*/


// METHOD-2 RECURSION

/*
class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        TreeNode lst = root.left;
        TreeNode rst = root.right;
        flatten(lst);
        flatten(rst);
        root.left=null;
        root.right = lst;
        TreeNode temp = root;
        while(temp.right!=null){
            temp = temp.right;
        }
        temp.right = rst;
    }
}
*/


// METHOD-3-) SOMETHING LIKE MORRIS TRAVERSAL


/*
class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode rst = curr.right;
                curr.right = curr.left;
                TreeNode pred = curr.left;
                while(pred.right!=null) pred = pred.right;
                pred.right = rst;
                curr.left = null; //imp
                curr = curr.right;
            } else{
                curr = curr.right;
            }
        }
    }
}
*/






    }
}
