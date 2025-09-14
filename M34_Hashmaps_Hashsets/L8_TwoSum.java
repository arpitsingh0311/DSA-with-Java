public class L8_TwoSum {
    public static void main(String[] args) {
    
// Ques-4-) Leetcode 1(Easy) Two Sum

// method-1


/*
class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i] + arr[j];
                if(sum == target){
                    ans[0] =  i;
                    ans[1] =  j;
                }
            }
        }
        return ans;
    }
}
*/


// METHOD-2-)

/*
class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                ans[0] = i;
                ans[1] = map.get(rem);
                return ans;
            } else map.put(arr[i],i);
        }


        return ans;
    }
}
*/



    }
}
