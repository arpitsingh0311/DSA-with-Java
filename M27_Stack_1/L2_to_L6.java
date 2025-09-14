package M27_Stack_1;

import java.util.Scanner;
import java.util.Stack;

public class L2_to_L6 {

    // QUes-5-) Print stack recursively
    public static void displayReverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top + " ");
        displayReverse(st);
        st.push(top);
    }
    public static void display(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        display(st);
        System.out.print(top + " ");
        st.push(top);
    }









    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        // Ques-1-) Reverse a stack

        /*Stack<Integer> stReverse = new Stack<>();
        while(!st.isEmpty()){
            int element = st.pop();
            stReverse.push(element);
        }
        System.out.println(stReverse);*/


        // Ques-2-) Copy Stack into another stack in same order.

        /*Stack<Integer> stNew = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        while(!temp.isEmpty()){
            stNew.push(temp.pop());
        }
        System.out.println(stNew);*/


        // Ques-3-) Display stack
        
        /*System.out.println(st);*/


        // Ques-4-)Push element at bottom or any index

        /*Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        System.out.print("Enter new element at bottom : ");
        int a = sc.nextInt();
        st.push(a);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);

        System.out.print("Enter index : ");
        int n = sc.nextInt();
        System.out.print("Enter element : ");
        int b = sc.nextInt();
        while(st.size()>=n){
            temp.push(st.pop());
        }
        st.push(b);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);*/


        // Ques-5-)Reverse Stack Recursively

        /*displayReverse(st);
        System.out.println();
        display(st);*/








    }
}
