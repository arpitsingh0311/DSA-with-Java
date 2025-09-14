package M28_Stack_2;

public class L4_DecodeString {
    

// Ques-4-) Leetcode 394    Decode String


/*
class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch!=']') st.push(ch);
            else{
                // get the substring
                StringBuilder sb = new StringBuilder();
                while(st.peek()!='['){
                    sb.append(st.pop());
                }
                // remove '[' 
                st.pop();
                // now get the number
                int k=0;
                int base = 1;
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    k = (st.pop()-'0')*base + k;
                    base *= 10;
                }
                // push k times string
                while(k-->0){
                    for(int i=sb.length()-1;i>=0;i--){
                        st.push(sb.charAt(i));
                    }
                }
            }
        }
        char[] result = new char[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            result[i] = st.pop();
        }

        return new String(result);
    }
}
*/





}

