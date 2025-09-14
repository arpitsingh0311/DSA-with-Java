public class L9_MinBitFlips {
    
// Ques-12-) Leetcode 2220(Easy) Minimum bit flips to convert number.

/*class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
    public int minBitFlips(int start, int goal) {
        int n = start^goal;
        return hammingWeight(n);
    }
}*/


// Ques-13-) Leetcode 342(Easy) Power of four

// METHOD-1

/*class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n<=0 || n%4!=0) return false;
        return isPowerOfFour(n/4);
    }
}*/

// METHOD-2

/*class Solution {
    public boolean isPerfectSquare(int n){
        int root = (int)Math.sqrt(n);
        return (root*root)==n;
    }
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        return ((n&(n-1))==0) && isPerfectSquare(n);
    }
}*/

// METHOD-3

/*class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        return ((n&(n-1))==0) && (n%3==1);
    }
}*/

}
