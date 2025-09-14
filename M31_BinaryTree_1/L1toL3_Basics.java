// package M31_BinaryTree_1;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}



public class L1toL3_Basics {

    public static void display(TreeNode root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        
        TreeNode a = new TreeNode(1); //a is the root
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        a.left = b; a.right=c;
        b.left = d; b.right=e;
        c.right = f;

        System.out.println(a.val);

        display(a);



    }
}
