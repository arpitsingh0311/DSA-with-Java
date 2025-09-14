// package M45_Bit_Manupilation;

public class L8_Numberof1bits {
    
// Ques-11-) Leetcode 191(Easy) Number of 1 bits

// METHOD-1  CHECK EACH POSITION

/*class Solution {
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            int mask = (1<<i);
            if((n&mask)!=0) count++;
        }
        return count;
    }
}*/

// METHOD-2 TURNING OFF THE RIGHTMOST SET BIT AGAIN AND AGAIN 

/*class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}*/


}
