public class L7_ValidAnagram {
    public static void main(String[] args) {
        
// Ques-3-) Leetcode 242(Easy) Valid Anagram

// METHOD-1 BRUTE FORCE


/*
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}
*/


//  METHOD-2 USING HASH-MAPS


/*
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> sMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            if(sMap.containsKey(key)){
                int freq = sMap.get(key);
                sMap.put(key,freq+1); 
            } else sMap.put(key,1);
        }
        HashMap<Character,Integer> tMap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char key = t.charAt(i);
            if(tMap.containsKey(key)){
                int freq = tMap.get(key);
                tMap.put(key,freq+1); 
            } else tMap.put(key,1);
        }

        for(char key : sMap.keySet()){
            int val1 = sMap.get(key);
            if(!tMap.containsKey(key)) return false;
            int val2 = tMap.get(key);
            if(val1!=val2) return false;
        }
        return true;
    }
}
*/








    }
}
