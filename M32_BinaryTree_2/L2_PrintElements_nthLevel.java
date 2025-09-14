
import java.util.*;

// package M32_BinaryTree_2;

public class L2_PrintElements_nthLevel {

    static int n;

    public static void nthLevelPreorder(TreeNode root, int level){
        if(root==null) return;
        if(level==n)System.out.print(root.val + " ");
        nthLevelPreorder(root.left,level+1);
        nthLevelPreorder(root.right,level+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 based indexing

        TreeNode a = new TreeNode(1); //a is the root
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        a.left = b; a.right=c;
        b.left = d; b.right=e;
        c.left = f; c.right=g;
        e.left = h; e.right=i;

        // System.out.print("Enter nth level as 0 based indexing : ");
        // n = sc.nextInt();
        for(int x=0;x<=3;x++){
            n=x;
            nthLevelPreorder(a,0);
        }


        // In all order(pre, in, post) ans will be same


    }
}
