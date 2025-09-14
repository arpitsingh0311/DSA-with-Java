package M28_Stack_2;

public class L2_MinStack {
    

//  Ques-2-) Leetcode 155  Min Stack


// Method-1 by making 2 stacks.

/*
class MinStack {

Stack<Integer> s;
Stack<Integer> min;

    public MinStack() {
        s = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(min.isEmpty() || min.peek() >= s.peek()) min.push(val);
    }
    
    public void pop() {
        if(!s.isEmpty()){
            int val = s.pop();
            if(min.peek() == val) min.pop();
        }
    }
    
    public int top() {
        if(s.isEmpty()) return -1;
        else return s.peek();
    }
    
    public int getMin() {
        if(min.isEmpty()) return -1;
        else return min.peek();
    }
}

*/



// Method-2   by using only one stack;


/*
class MinStack {

int min;
Stack<Integer> st;

    public MinStack() {
        min = Integer.MAX_VALUE;
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(val<=min){
            st.push(min);
            min = val;
        }
        st.push(val);
    }
    
    public void pop() {
        if(st.pop()==min)
        min = st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}

*/









}
