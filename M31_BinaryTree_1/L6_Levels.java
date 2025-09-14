public class L6_Levels {

// Ques-7-)Find the levels of binary tree.

    public static int levels(TreeNode root){
        if(root==null) return 0;
        int ans = 1 + Math.max(levels(root.left),levels(root.right));
        return ans;
    }



    public static void main(String[] args) {
        
        TreeNode a = new TreeNode(1); //a is the root
        TreeNode b = new TreeNode(41);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        TreeNode g = new TreeNode(10);
        TreeNode h = new TreeNode(20);
        a.left = b; a.right=c;
        b.left = d; b.right=e;
        c.left=g; c.right = f;
        g.left = h;


        System.out.println(levels(a));







    }
}
