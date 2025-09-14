public class L5_ConvertBSTtoMaxHeap {
    public static void main(String[] args) {
        

// Ques-2-) Geeks For Geeks   Convert BST(Binary Search Tree) to MaxHeap



/*
class Solution
{
    public static void revInorder(Node root , ArrayList<Integer> arr){
        if(root==null) return;
        revInorder(root.right,arr);
        arr.add(root.data);
        revInorder(root.left,arr);
    }
    public static void revPreorder(Node root , ArrayList<Integer> arr,int[] idx){
        if(root==null) return;
        root.data = arr.get(idx[0]++);
        revPreorder(root.right,arr,idx);
        revPreorder(root.left,arr,idx);
    }
    public static void convertToMaxHeapUtil(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        revInorder(root,arr);
        int[] idx = {0};
        revPreorder(root,arr,idx);
        
    }
}
*/











    }
}
