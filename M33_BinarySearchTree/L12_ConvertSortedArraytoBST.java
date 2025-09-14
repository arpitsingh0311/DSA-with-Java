public class L12_ConvertSortedArraytoBST {
    public static void main(String[] args) {
        

// Ques-7-) Leetcode 108 (Easy) Convert Sorted Array to Binary Search Tree



/*
class Solution {
    public TreeNode helper(int[] arr,int lo,int hi){
        if(lo>hi) return null;
        int mid = (lo+hi)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = helper(arr,lo,mid-1);
        root.right = helper(arr,mid+1,hi);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] arr) {
        return helper(arr,0,arr.length-1);
    }
}
*/



// Ques-8-) Leetcode 1382(Medium) Balance a BST


/*
class Solution {
    public TreeNode helper(List<Integer> arr, int lo, int hi){
        if(lo>hi) return null;
        int mid = (lo+hi)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = helper(arr,lo,mid-1);
        root.right = helper(arr,mid+1,hi);
        return root;
    }

    public void inorder(TreeNode root, List<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        return helper(arr,0,arr.size()-1);
    }
}
*/

    }
}
