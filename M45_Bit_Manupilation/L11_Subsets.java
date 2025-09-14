public class L11_Subsets {
    
// Ques-15-) Leetcode 78(Medium) Subsets

/*class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int total = (1<<n);
        for(int num=0;num<total;num++){
            List<Integer> list = new ArrayList<>();
            for(int bitIdx=0;bitIdx<n;bitIdx++){
                int mask = (1<<bitIdx);
                if((mask&num) != 0) list.add(nums[bitIdx]);
            }
            ans.add(list);
        }
        return ans;
    }
}*/



}
