public class L13_BinaryTreePaths {
    public static void main(String[] args) {
        
// Ques-16-) Leetcode - 257(Easy) Binary Tree Paths


/*
class Solution {
    public void path(TreeNode root, String s, List<String> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s += root.val;
            ans.add(s);
            return;
        }
        path(root.left,s+root.val+"->",ans);
        path(root.right,s+root.val+"->",ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        path(root,"",ans);
        return ans;
    }
} 
*/

// Ques-17-) Leetcode-112(Easy) Path Sum

/*
class Solution {
    public void sum(TreeNode root,int a,List<Integer> arr){
        if(root==null) return;
        if(root.left==null && root.right==null){
            a += root.val;
            arr.add(a);
            return;
        }
        sum(root.left,root.val+a,arr);
        sum(root.right,root.val+a,arr);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> arr = new ArrayList<>();
        int a=0;
        sum(root,a,arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == targetSum) return true;
        }
        return false;
    }
} 
*/


    }
}
