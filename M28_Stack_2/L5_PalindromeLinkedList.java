package M28_Stack_2;

public class L5_PalindromeLinkedList {
    
// Ques-5-) Leetcode 234     Palandrome Linked List

/*

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> rev = new Stack<>();
        while(temp!=null){
            rev.push(temp.val);
            temp = temp.next;
        }
        while(head!=null && !rev.isEmpty()){
            if(rev.pop()!= head.val) return false;
            else head = head.next;
        }

        return true;
    }
}
 */
}
