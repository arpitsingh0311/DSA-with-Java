package M25_linkedList_2;

public class L11_SortList {
    
    // Ques-11-) [Leetcode 148] Sort List.

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
    
    //     public ListNode sortList(ListNode head) {
    //         if(head==null || head.next==null) return head;
    //         ListNode list1 = head;
    //         ListNode slow = head;
    //         ListNode fast = head;
    //         while(fast.next != null && fast.next.next!= null){
    //             slow = slow.next;
    //             fast = fast.next.next;
    //         }
    //         ListNode list2 = slow.next;
    //         slow.next = null;
    //         list1 = sortList(list1);
    //         list2 = sortList(list2);
    //         head = mergeTwoLists(list1,list2);
    //         return head;
    //     }
    // }



// Ques-12-) leetcode 23 Merge k sorted list.



}
