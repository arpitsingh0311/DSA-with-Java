public class L16_UniqueLength {
    public static void main(String[] args) {
        
// Ques-14-) Leetcode 1930(medium)  Unique Length-3 palindromic Subsequences

/*
class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> fmap = new HashMap<>();
        HashMap<Character,Integer> lmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!fmap.containsKey(ch)) fmap.put(ch,i);
            lmap.put(ch,i);
        }
        int count = 0;
        for (char i : fmap.keySet()) { 
            int fidx = fmap.get(i);
            int lidx = lmap.get(i);
            HashSet<Character> set = new HashSet<>();
            for (int j = fidx + 1; j < lidx; j++) {
                set.add(s.charAt(j));
            }
            count += set.size();
        }
        return count;
    }
}
*/



// Ques-15-) Leetcode 1781() Sum of beauty of all substrings




    }
}
