public class L15_DeleteNodeinBST {
    public static void main(String[] args) {
        
// Ques-10-) Leetcode 450(Medium)  Delete Node in a BST.


/*
class Solution {
    public TreeNode iop(TreeNode root){
        TreeNode temp = root.left;
        while(temp.right!=null) temp = temp.right;
        return temp;
    }
    public TreeNode parent(TreeNode root, TreeNode pred){
        if(root.left==pred || root.right==pred) return root;
        TreeNode temp = root.left;
        while(temp.right!=pred)  temp = temp.right;
        return temp;
    }  
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){  //deletion
            // Case 1 : 0 child nodes
            if(root.left==null && root.right==null) return null;
            // Case 2 : 1 child node
            else if(root.left==null || root.right==null){
                if(root.left==null) return root.right;
                else return root.left;
            }
            // Case 3 : 2 child node
            else{
                TreeNode pred = iop(root);
                TreeNode predParent = parent(root,pred);
                if(root==predParent){
                    pred.right = root.right;
                    return pred;
                }
                predParent.right = pred.left;
                pred.left = root.left; pred.right = root.right;
                return pred;
            }
            
        } 
        else if(root.val>key){   //LST will change
            root.left = deleteNode(root.left,key);
        }  
        else{ // root.val<key : RST will change
            root.right = deleteNode(root.right,key);
        }
        return root;
    }
}
*/




// Ques-11-) Count BST Subtrees that lie in given range.

// Ques-12-) Shortest distance between two nodes in BST.




    }
}
