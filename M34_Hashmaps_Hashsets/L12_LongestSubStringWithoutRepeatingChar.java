public class L12_LongestSubStringWithoutRepeatingChar{
    public static void main(String[] args) {
        

// Ques-7-) Leetcode 3(Medium) Longest SubString Without repeating Characters



/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 2 pointer approach, i and j sliding window from i to j
        int n = s.length();
        if(n<=1) return n;
        int maxLen = 0;
        int i=0, j=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){
                int len = j-i;
                maxLen = Math.max(maxLen,len);
                // i ko leke jao ch ki purani position se 1 agge
                while(s.charAt(i)!=ch) i++;
                i++; // ek agge nikalna hai
            }
            map.put(ch,j);
            j++;
        }
        int len = j-i;
        maxLen = Math.max(maxLen,len);
        return maxLen;
    }
}
*/






    }
}