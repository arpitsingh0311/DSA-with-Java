class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}


public class L4_SumOfTreeNodes {

// Ques-1-) Find sum of tree nodes.

    public static int sum(TreeNode root){
        if(root==null) return 0;
        int ans = root.val + sum(root.left) + sum(root.right);
        return ans;
    }


// Ques-2-) Find the product of tree nodes.

    public static long product(TreeNode root){
        if(root==null) return 1;
        long ans = root.val * product(root.left) * product(root.right);
        return ans;
    }

// Ques-3-) Find the product of non-zero elements of nodes.

    public static long productWithoutZero(TreeNode root){
        if(root==null) return 1;
        if(root.val==0) return productWithoutZero(root.left) * productWithoutZero(root.right);;
        long ans = root.val * productWithoutZero(root.left) * productWithoutZero(root.right);
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


        // System.out.println(sum(a));
        
        // System.out.println(product(a));

        System.out.println(productWithoutZero(a));
        
    }
}
