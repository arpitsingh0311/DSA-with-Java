class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class L5_MaxValue_And_Size {

// Ques-4-)Find node with max value.

    public static int Max(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(Max(root.left),Max(root.right)));
    }


//  Ques-5-)Find node with min value.

    public static int Min(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(Min(root.left),  Min(root.right)));
    }


// Ques-6-)Find the size of Binary tree.

    public static int size(TreeNode root){
        if(root==null) return 0;
        int ans = 1 + size(root.left) + size(root.right);
        return ans;
    }



    public static void main(String[] args) {
        
        TreeNode a = new TreeNode(1); //a is the root
        TreeNode b = new TreeNode(41);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        TreeNode g = new TreeNode(-5000);
        TreeNode h = new TreeNode(20);
        a.left = b; a.right=c;
        b.left = d; b.right=e;
        c.left=g; c.right = f;
        g.left = h;


        System.out.println(Max(a));

        System.out.println(Min(a));
        
        System.out.println(size(a));


    }
}
