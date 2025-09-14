public class L5_BoatstoSavePeople {
    

// Ques-5-) Leetcode 881(Medium) Boats to Save People

/*
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0, right = people.length - 1;
        int ans = 0;
        while(left <= right) {
            if(people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            ans++;
        }
        return ans;
    }
}
*/



}
