public class L16_MorrisTraversal {
    public static void main(String[] args) {
        

// Ques-13-) Leetcode 94(Easy)  Binary Tree Inorder Traversal


/*
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){  // left hai
                TreeNode pred = curr.left;
                while(pred.right!=null && pred.right!=curr)
                    pred = pred.right;
                if(pred.right==null){  // link
                    pred.right = curr;
                    curr = curr.left;
                } else{   // pred.right = curr : unlink
                    pred.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }

            }
            else{  //left nhi hai
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        return ans;
    }
}
*/


    }
}
