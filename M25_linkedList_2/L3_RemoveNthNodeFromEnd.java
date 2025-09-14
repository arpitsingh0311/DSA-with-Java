package M25_linkedList_2;

public class L3_RemoveNthNodeFromEnd {
    
    // Ques-4-) Leetcode 19  Remove nth node from the end of linked list 

    //Method 1

    // class Solution {
    //     public ListNode removeNthFromEnd(ListNode head, int n) {
    //         ListNode temp = head;
    //         int len =0;
    //         while(temp!=null){
    //             temp = temp.next;
    //             len++;
    //         }
    //         if(len==n) return head.next;
    //         temp=head;
    //         for(int i=1;i<len-n;i++){
    //             temp = temp.next;
    //         }
    //         temp.next = temp.next.next;
    //         return head;
    //     }
    // }


    // Method 2 slow  fast method

    // class Solution {
    //     public ListNode removeNthFromEnd(ListNode head, int n) {
    //         ListNode slow = head;
    //         ListNode fast = head;
    //         if(head.next==null)return null;
    //         for(int i=1;i<=n;i++){
    //             fast = fast.next;
    //         }
    //         if(fast==null){ // n==len
    //             return head.next;
    //         } 
    //         while(fast.next!=null){
    //             slow=slow.next;
    //             fast=fast.next;
    //         }
    //         slow.next = slow.next.next;
    //         return head;
    //     }
    // }


    // Ques-5-) Leetcode 1721 Swapping Nodes in a linked list

    // class Solution {
    //     public ListNode swapNodes(ListNode head, int k) {
    //         ListNode slow = head;
    //         ListNode fast = head;
    //         for(int i=1;i<k;i++){
    //             fast = fast.next;
    //         }
    //         ListNode a = fast;
    //         while(fast.next!=null){
    //             slow = slow.next;
    //             fast = fast.next;
    //         }
    //         int temp = a.val;
    //         a.val = slow.val;
    //         slow.val = temp;
    //         return head;
    //     }
    // }





}
