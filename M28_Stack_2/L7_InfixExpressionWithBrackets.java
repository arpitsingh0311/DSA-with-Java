package M28_Stack_2;

import java.util.Stack;

public class L7_InfixExpressionWithBrackets {
    public static void main(String[] args) {
        
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if(ascii >= 48 && ascii <= 57) {  // If the character is a digit
                val.push(ascii - 48);
            } else if(op.isEmpty() || ch == '(') {  // If the stack is empty or ch is '('
                op.push(ch);
            } else if(ch == ')') {  // If the character is ')'
                while(op.peek() != '(') {
                    // Perform the operation
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();
                    
                    if(operator == '-') val.push(v1 - v2);
                    if(operator == '+') val.push(v1 + v2);
                    if(operator == '*') val.push(v1 * v2);
                    if(operator == '/') val.push(v1 / v2);
                }
                op.pop();  // Pop the '(' from the stack
            } else {
                // Handle the precedence of the operators
                while(!op.isEmpty() && op.peek() != '(' && precedence(op.peek()) >= precedence(ch)) {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();
                    
                    if(operator == '-') val.push(v1 - v2);
                    if(operator == '+') val.push(v1 + v2);
                    if(operator == '*') val.push(v1 * v2);
                    if(operator == '/') val.push(v1 / v2);
                }
                op.push(ch);
            }
        }

        // Perform remaining operations in the stacks
        while(!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char operator = op.pop();
            
            if(operator == '-') val.push(v1 - v2);
            if(operator == '+') val.push(v1 + v2);
            if(operator == '*') val.push(v1 * v2);
            if(operator == '/') val.push(v1 / v2);
        }

        System.out.println(str);
        System.out.println(val.peek());
    }

    // Helper method to define the precedence of operators
    public static int precedence(char ch) {
        if(ch == '+' || ch == '-') return 1;
        if(ch == '*' || ch == '/') return 2;
        return -1;
    }
}
