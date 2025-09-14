public class L6_CheckBTisMaxHeap {
    public static void main(String[] args) {
        

// Ques-3-) Geeeks for Geeks    Check if given Binary Tree is a MaxHeap or not.

/*
class Solution {
    // Function to check if the binary tree is a complete binary tree (CBT)
    boolean isCBT(Node root, int nodeCount, int index) {
        if (root == null) return true;
        if (index >= nodeCount) return false;
        return isCBT(root.left, nodeCount, 2 * index + 1) && isCBT(root.right, nodeCount, 2 * index + 2);
    }

    // Function to check if the binary tree satisfies the max-heap property
    boolean heapProperty(Node root) {
        if (root == null) return true;
        if (root.left != null && root.data < root.left.data) return false;
        if (root.right != null && root.data < root.right.data) return false;
        return heapProperty(root.left) && heapProperty(root.right);
    }

    // Function to count the total number of nodes in the tree
    int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Main function to check if the tree is a max-heap
    boolean isHeap(Node root) {
        int nodeCount = countNodes(root);
        return isCBT(root, nodeCount, 0) && heapProperty(root);
    }
}
*/




    }
}
