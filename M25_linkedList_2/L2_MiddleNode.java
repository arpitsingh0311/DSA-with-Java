package M25_linkedList_2;

public class L2_MiddleNode {
    
// Ques-2-) Leetcode 876 Middle of the linked list.

//Method 1

// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode temp = head;
//         int n=0;
//         while(temp!=null){
//             temp = temp.next;
//             n++;
//         }
//         temp = head;
//         for(int i=0;i<n/2;i++){
//             temp = temp.next;
//         }
//         return temp;
    
//     }
// }

// Method 2 (without finding the length or slow-fast approach)

// class Solution {
    // public ListNode middleNode(ListNode head) {
    //     ListNode slow = head;
    //     ListNode fast = head;
    //     while(fast != null && fast.next != null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;
    // }
// }


// Ques-3-) Leetcose 2095 Delete the Middle Node of a Linked List.

// class Solution {
//     public ListNode deleteMiddle(ListNode head) {
//         if(head.next==null) {
//             head = null;
//             return head;
//         }
//         ListNode slow = head;
//         ListNode fast = head.next.next;

//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         slow.next = slow.next.next;
//         return head;
//     }
// }



}
