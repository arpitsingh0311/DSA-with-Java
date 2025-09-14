// package M29_Queue;

public class L11_FirstNegativeInEachWindow {
    public static void main(String[] args) {
        
// Ques-6-) GFG  First negative in each window of size 'k'.

/*

class Solution {

    // Function to find the first negative integer in every window of size k
    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0)q.add(i);
        }
        for(int i=0;i<n-k+1;i++){
            if(q.size()>0 && q.peek()<i) q.remove();
            if(q.size()>0 && q.peek()<=i+k-1) ans.add(arr[q.peek()]);
            else if(q.size()==0) ans.add(0);
            else ans.add(0);
        }
        return ans;
    }
}
*/











    }
}
