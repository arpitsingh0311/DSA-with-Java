package M25_linkedList_2;

public class L14_PalandromeLinkedList {
    
    // Ques-15-) Leetcode 234 Palandrome Linked List

    // method-0-) getNodeAt 

    // Method-1-) Creating an ArrayList

    // Method-2-) Create deep copy and use reverse linked list

//     class Solution {
//         public ListNode reverseList(ListNode head) {
//             ListNode curr = head;
//             ListNode prev = null;
//             ListNode Next = head;
//             while(curr != null){
//                 Next = curr.next;
//                 curr.next = prev;
//                 prev = curr;
//                 curr = Next;
//             }
//             return prev;
    
//         }
//     public boolean isPalindrome(ListNode head) {
//         if(head.next==null) return true;
//         // Create a deep copy
        // ListNode newHead = new ListNode(head.val);
        // ListNode t1 = head.next;
        // ListNode t2 = newHead;
        // while(t1!=null){
        //     ListNode temp = new ListNode(t1.val);
        //     t2.next = temp;
        //     t2 = t2.next;
        //     t1 = t1.next;    
        // }
//         newHead = reverseList(newHead);
//         t1 = head;
//         t2 = newHead;
//         while(t1!= null){
//             if(t1.val!=t2.val) return false;
//             t2 = t2.next;
//             t1 = t1.next; 
//         }
//         return true;
//      }
//      }


    // Method-3-) Reverse the second half

        // class Solution {
        //         public ListNode reverseList(ListNode head) {
        //             ListNode curr = head;
        //             ListNode prev = null;
        //             ListNode Next = head;
        //             while(curr != null){
        //                 Next = curr.next;
        //                 curr.next = prev;
        //                 prev = curr;
        //                 curr = Next;
        //             }
        //             return prev;
        //         }
        //     public boolean isPalindrome(ListNode head) {
        //         ListNode slow = head;
        //         ListNode fast = head;
        //         while(fast != null && fast.next != null){
        //             slow = slow.next;
        //             fast = fast.next.next;
        //         }
        //     ListNode t1 = head;
        //     ListNode t2 = reverseList(slow);
        //     while(t2!=null){
        //         if(t1.val!=t2.val) return false;
        //         t1 = t1.next;
        //         t2 = t2.next;
        //     }
        //     return true;
        //     }
        // }




//  ques-16-) Leetcode 2130     Maximum Twin Sum of a Linked List


    // class Solution {
    //     public ListNode reverseList(ListNode head){
    //         ListNode curr = head;
    //         ListNode Next = head;
    //         ListNode prev = null;
    //         while(curr!=null){
    //             Next = curr.next;
    //             curr.next = prev;
    //             prev = curr;
    //             curr = Next;
    //         }
    //         return prev;
    //     }
    
    //     public int pairSum(ListNode head) {
    //         ListNode slow = head;
    //         ListNode fast = head;
    //         while(fast!=null && fast.next != null){
    //             slow = slow.next;
    //             fast = fast.next.next;
    //         }
    //         ListNode t1 = head;
    //         ListNode t2 = reverseList(slow);
    //         int maxSum = 0;
    //         while(t2!=null){
    //             maxSum = Math.max(maxSum,t1.val+t2.val);
    //             t1=t1.next;
    //             t2=t2.next;
    //         }
    //         return maxSum;
    //     }
    // }



}
