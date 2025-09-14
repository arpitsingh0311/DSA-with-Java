package M27_Stack_1;

public class L12_NextGreaterElement_2 {

// Ques-9-) Leetcode 503 Next Greater Element II

/*
import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize the result array with -1
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        // Iterate through the array twice to handle the circular nature
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                result[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return result;
    }
}

 */


}
