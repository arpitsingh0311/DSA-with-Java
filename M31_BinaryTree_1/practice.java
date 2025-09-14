class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class practice {

// Display a tree 
    public static void display(TreeNode root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

// Ques-1-) Find the sum of treenodes.

    public static int sum(TreeNode root){
        if(root==null) return 0;
        return (root.val + sum(root.left) + sum(root.right)); 
    }

// Ques-2-) Find the product of tree nodes.

    public static long product(TreeNode root){
        if(root==null) return 1;
        return (root.val*product(root.left)*product(root.right));
    }


// Ques-3-) Find the product of non-zero elements of nodes.

    public static long pwoz(TreeNode root){
        if(root==null) return 1;
        if(root.val==0) return (pwoz(root.left)*pwoz(root.right));
        return (root.val*pwoz(root.left)*pwoz(root.right));
    }

// Ques-4-)Find node with max value.

    public static int max(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left),max(root.right)));
    }

//  Ques-5-)Find node with min value.

    public static int min(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min (min(root.left),min(root.right)));
    }

// Ques-6-)Find the size of Binary tree.

    public static int size(TreeNode root){
        if(root==null) return 0;
        return (1 + size(root.left)+size(root.right));
    }

// Ques-7-)Find the levels of binary tree.

    public static int levels(TreeNode root){
        if(root==null) return 0;
        return (1 + Math.max(levels(root.left),levels(root.right)));
    }

// Ques-8-) Leetcode 144(Easy) Binary Tree Preorder Traversal

    // Done

// Ques-9-) Leetcode 94(Easy) Binary Tree Inorder Traversal

    // Done

// Ques-10-) Leetcode 145(Easy) Binary Tree Postorder Traversal

    // Done

// Ques-11-) Leetcode - 226(Easy)   Invert Binary Tree

    // Done

// Ques-12-) Leetcode - 100(Easy)  Same Tree

// Ques-13-) Leetcode - 101(Easy)  Symmetric Tree.

// Ques-14-) Leetcode - 543(Easy) Diameter of Binary Tree.

// Ques-15-) Leetcode - 236(Medium)  Lowest Common Ancestor of a Binary Tree.

// Ques-16-) Leetcode - 257(Easy) Binary Tree Paths

// Ques-17-) Leetcode-112(Easy) Path Sum











    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(30);
        TreeNode d = new TreeNode(40);
        TreeNode e = new TreeNode(50);
        TreeNode f = new TreeNode(60);
        TreeNode g = new TreeNode(70);
        TreeNode h = new TreeNode(80);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        d.left = h;
        
        // display(a);
        // System.out.println(sum(a));
        // System.out.println(product(a));
        // System.out.println(pwoz(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(size(a));
        System.out.println(levels(a));



    }
}
