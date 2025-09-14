package M25_linkedList_2;

public class L10_Merge2SortedLists {
    
// Ques-10-) Leetcode 21 Merge 2 sorted arrays

// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode temp1 = list1;
//         ListNode temp2 = list2;
//         ListNode dummy = new ListNode(-1);
//         ListNode temp = dummy;
//         while(temp1 != null && temp2 != null){
//             if(temp1.val <= temp2.val){
//                 temp.next = temp1;
//                 temp1 = temp1.next;
//             } else{
//                 temp.next = temp2;
//                 temp2 = temp2.next;
//             }
//             temp = temp.next;
//         }
//         if(temp1==null) temp.next = temp2;
//         else temp.next = temp1;
//         return dummy.next;
//     }
// }





}
