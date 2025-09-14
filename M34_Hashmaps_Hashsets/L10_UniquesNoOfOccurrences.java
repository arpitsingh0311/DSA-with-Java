public class L10_UniquesNoOfOccurrences {
    public static void main(String[] args) {
        

// Ques-5-) Leetcode 1207(Easy) Unique Number of Occurrences



/*
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            if(map.containsKey(key)){
                int freq = map.get(key);
                map.put(key,freq+1);
            }
            else map.put(key,1);
        }
        for(int val : map.values()){
            set.add(val);
        }
        if(set.size()==map.size()) return true;
        else return false;
    }
}
*/









    }
}
