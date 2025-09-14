package M25_linkedList_2;

public class L12_PartitionList {
    
// Ques-13-) Leetcode 86  Partition List


// class Solution {
//     public ListNode partition(ListNode head, int x) {
//         ListNode lesshead = new ListNode(0);
//         ListNode greaterhead = new ListNode(0);
//         ListNode less = lesshead;
//         ListNode greater = greaterhead;
//         ListNode temp = head;
//         while(temp != null){
//             if(temp.val<x){
//                 less.next = temp;
//                 less = less.next;
//             } else{
//                 greater.next = temp;
//                 greater = greater.next;
//             }
//             temp=temp.next;
//         }
//         greater.next = null;
//         less.next = greaterhead.next;
//     return lesshead.next;
//     }
// }




}
