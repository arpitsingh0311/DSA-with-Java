package M27_Stack_1;

public class L11_RemoveAllAdjacentDuplicates {
    
// Ques-8-) Leetcode 1047 Remove all adjacent duplicates in string


/*
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == c) st.pop();
            else st.push(c);
        } 
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}
 */





}
