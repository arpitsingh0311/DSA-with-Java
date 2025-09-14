package M28_Stack_2;

public class L1_NumberOfVisiblePeople {
 
    
// Ques-1-) Leetcode 1944 Number of visible people in a queue


// My solution but   T.C. == O(n²)

/*
class Solution {
    public int[] nextLargestElement(int [] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                ans[i] = stack.peek();
            } else {
                ans[i] = n-1; 
            }
            stack.push(i);
        }
        return ans;
    }

    public int[] canSeePersonsCount(int[] heights) {
        int[] nle = nextLargestElement(heights);
        int[] ans = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<heights.length-1;i++){
            while(!st.isEmpty()) st.pop();
            st.push(heights[i+1]);
            int j=i+2;
            while(j<=nle[i]){
                if(!st.isEmpty() && heights[j]>=st.peek()) st.push(heights[j]);
                j++;
            }
            ans[i] = st.size();
        }


        return ans;
    }
}

*/



// Actual Solution 


/* 
class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]<=heights[i]){
                res[st.peek()]++;
                st.pop();
            }
            if(!st.isEmpty()) res[st.peek()]++;
            st.push(i);
        }
        return res;
    }
}
*/






}
