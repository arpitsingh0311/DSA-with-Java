package M27_Stack_1;

import java.util.Stack;

public class L14_StockSpamProblem {
    
// Ques-11-) GeeksforGeeks  Stock Spam Problem
/*
The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate the span of stocks price for all n days. 
The span Si of the stocks price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the given day is less than or equal to its price on the current day.
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}.
*/

public static void printArr(int[] arr){
    for(int ele : arr){
        System.out.print(ele + " ");
    }
    System.out.println();
}

public static void calculateSpanBF(int[] price, int n , int[] ans){
    ans[0] = 1;
    for(int i=1;i<n;i++){
        ans[i] = 1;
        for(int j=i-1;j>=0 && (price[i]>=price[j]);j--){
            ans[i]++;
        }
    }
}

public static int[] calculateSpan(int price[], int n){
    int[] arr = new int[n];
    Stack<Integer> st = new Stack<>();
    st.push(0);
    for(int i=0;i<n;i++){
        while(!st.isEmpty() && price[i]>= price[st.peek()]) st.pop();
        if(st.isEmpty()) arr[i] = i+1;
        else arr[i] = i-st.peek();
        st.push(i);
    }
    return arr;
}


public static void main(String[] args) {
    int price[] = {10,4,5,90,120,80};
    int n = price.length;
    int ans[] = new int[n];
    printArr(price);

// Method 1  bruteforce approach

    calculateSpanBF(price, n, ans);
    printArr(ans);
    


// Method 2 Using stacks

    ans = calculateSpan(price,n);
    printArr(ans);






}









}
