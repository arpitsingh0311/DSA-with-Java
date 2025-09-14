import java.util.ArrayDeque;
import java.util.Queue;

public class L3to4_Leetcode102 {

    public static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }

    public static void levelOrder(TreeNode root){
        int prevlvl = 0;
        Queue<Pair> q = new ArrayDeque<>();
        Pair p = new Pair(root,0);
        if(root!=null) q.add(p);
        while(q.size()>0){
            Pair front = q.remove();
            TreeNode temp = front.node;
            int lvl = front.level;
            if(lvl!=prevlvl){
                System.out.println();
                prevlvl++;
            }
            System.out.print(temp.val + " ");
            if(temp.left!=null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));
        }
        System.out.println();
    }



    public static void main(String[] args) {
        

// Ques-1-)  Leetcode 102(Medium) Binary tree level order traversal

// Using  preorder 


/*
class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public void nthLevelPreorder(TreeNode root, int level, int lvl, List<Integer> arr)
    {
        if(root==null) return;
        if(level==lvl) arr.add(root.val);
        nthLevelPreorder(root.left,level+1,lvl,arr);
        nthLevelPreorder(root.right,level+1,lvl,arr);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = levels(root);
        for(int i=0;i<lvl;i++){
            List<Integer> arr = new ArrayList<>();
            nthLevelPreorder(root,0,i,arr);
            ans.add(arr);
        }
        return ans;
    }
} 
*/


// Using queues

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

        levelOrder(a);


/*
class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }

    public static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }

    public void BFS(TreeNode root, List<List<Integer>> ans){
        Queue<Pair> q = new ArrayDeque<>();
        Pair p = new Pair(root,0);
        if(root!=null) q.add(p);
        while(q.size()>0){
            Pair front = q.remove();
            TreeNode temp = front.node;
            int lvl = front.level;

            ans.get(lvl).add(temp.val);
            
            if(temp.left!=null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = levels(root);
        for(int i=0;i<lvl;i++){
            List<Integer> arr = new ArrayList<>();
            ans.add(arr);
        }
        BFS(root,ans);
        return ans;
    }
} 
*/







// Ques-2-) Leetcode 103(Med)  Binary tree zigzag level order traversal


/* 
class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }

    public static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }

    public void BFS(TreeNode root, List<List<Integer>> ans){
        Queue<Pair> q = new ArrayDeque<>();
        Pair p = new Pair(root,0);
        if(root!=null) q.add(p);
        while(q.size()>0){
            Pair front = q.remove();
            TreeNode temp = front.node;
            int lvl = front.level;
            // Ensure ans list has space for the current level
            if(ans.size() <= lvl) ans.add(new ArrayList<>());

            // Add to the current level based on the zigzag pattern
            if(lvl % 2 == 0) {
                ans.get(lvl).add(temp.val);  // For even levels, add normally
            } else {
                ans.get(lvl).add(0, temp.val);  // For odd levels, add at the beginning (reverse order)
            }

            if(temp.left!=null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = levels(root);
        for(int i=0;i<lvl;i++){
            List<Integer> arr = new ArrayList<>();
            ans.add(arr);
        }
        BFS(root,ans);
        return ans;
    }
}
*/



    }
}
