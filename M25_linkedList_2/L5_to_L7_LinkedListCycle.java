package M25_linkedList_2;

public class L5_to_L7_LinkedListCycle {
    
    // Ques - 7-) leetcode 141 Linked List Cycle

    // public class Solution {
    //     public boolean hasCycle(ListNode head) {
    //         ListNode s = head;
    //         ListNode f = head;
    //     while(f!=null&&f.next!=null){
    //         s = s.next;
    //         f = f.next.next;
    //         if(s==f) return true;
    //     }
    //     return false;
    //     }
    // }


    // Ques -8-) leetcode 142 Linked List Cycle - II

//     /**
//  * Definition for singly-linked list.
//  * class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
//  */
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast){
//                 ListNode entry = head;
//                 while(entry != slow){
//                     slow = slow.next;
//                     entry = entry.next;
//                 }
//                 return entry;
//             }
//         }
//         return null;
//     }
// }





}
