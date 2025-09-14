package M27_Stack_1;

public class L10_ValidParenthesis {
    public static void main(String[] args) {
        
// Ques-7-) leetcode 20 Valid parenthesis (Balanced brackets)

// My solution

/*
 class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c =  s.charAt(i);
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()) return false;
                else{
                    char a = st.pop();
                    if((c==')' && a != '(') || (c=='}' && a != '{') || (c==']' && a != '[') ) return false;
                }    
            }
        }
        if(st.isEmpty()) return true;
        else return false;    
    }
}
 */



    }
}
