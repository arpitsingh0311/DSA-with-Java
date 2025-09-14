
public class L15_CountNicePairs {
    public static void main(String[] args) {
        

// Ques-11-) Leetcode 1814(Med) Count Nice Pairs in an Array

// Solution but time limit exceeded

/*
class Solution {
    public int rev(int n){
        int r=0;
        while(n!=0){
            r = r*10 + n%10;
            n /= 10;
        }
        return r;
    }
    public int countNicePairs(int[] nums) {
        int count = 0; 
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+rev(nums[j])==nums[j]+rev(nums[i])) count++;
            }
        } 
        return count;
    }
}
*/


// less time complex


/*
class Solution {
    public int rev(int n){
        int r=0;
        while(n!=0){
            r = r*10 + n%10;
            n /= 10;
        }
        return r;
    }
    public int countNicePairs(int[] nums) {
        int count = 0; 
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+rev(nums[j])==nums[j]+rev(nums[i])) count++;
            }
        } 
        return count;
    }
}
*/


// Ques-12-) Leetcode 138(Med) Copy list with random pointer.


/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
/*class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node head2 = new Node(head.val);
        // Deep copy of the linked list 
        Node temp2 = head2;
        Node temp = head.next;
        while(temp!=null){
            Node dup = new Node(temp.val);
            temp2.next = dup;
            temp2 = dup;
            temp = temp.next;
        }
        // Maping of both linked list in the HashMap
        HashMap<Node,Node> map = new HashMap<>();
        temp2 = head2;
        temp = head;
        while(temp!=null){
            map.put(temp,temp2);
            temp = temp.next;
            temp2 = temp2.next;
        }
        // Assigning the ramdom pointers
        for(Node original : map.keySet()){
            Node duplicate = map.get(original);
            if(original.random!=null)
                duplicate.random = map.get(original.random);
        }
        return head2;
    }
}
*/







// HomeWork

// Ques-13-) Leetcode 1679 max Number of K-Sum Pairs



    }
}
