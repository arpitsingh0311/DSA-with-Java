// package M45_Bit_Manupilation;

public class L7_PowerOfTwo {
    
// Ques-10-) Leetcode 231(Easy) Power of Two   

// METHOD-1  BRUTE FORCE (RECURSION)

/*class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n<=0 || n%2!=0) return false;
        return isPowerOfTwo(n/2);
    }
}*/


// METHOD-2    & OPERATOR

/*class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n<=0) ? false : (n&(n-1))==0;
    }
}*/

}
