package M25_linkedList_2;

public class L13_ReverseLL {
    
    // Ques-14-) Leetcode 206    Reversed linked list

    // Method 1 Itterative method

    // class Solution {
        // public ListNode reverseList(ListNode head) {
        //     ListNode curr = head;
        //     ListNode prev = null;
        //     ListNode Next = head;
        //     while(curr != null){
        //         Next = curr.next;
        //         curr.next = prev;
        //         prev = curr;
        //         curr = Next;
        //     }
        //     return prev;
        // }
    // }


    //  Method-2 Recursive method

    // class Solution {
    //     public ListNode reverseList(ListNode head) {
    //         if(head == null || head.next == null) return head;
    //         ListNode a = head.next;
    //         ListNode newHead = reverseList(a);
    //         a.next = head;
    //         head.next = null;
    //         return newHead;
    //     }
    // }


}
