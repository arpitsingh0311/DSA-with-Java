public class L12_ReverseBits {
    
// Ques-16-) Leetcode 190(Easy) Reverse Bits

/*public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int i=0, j=31;
        while(i<j){
            int imask = (1<<i) , jmask = (1<<j);
            boolean iOn = ((n&imask)!=0), jOn = ((n&jmask)!=0);
            if(iOn!=jOn){
                n ^= imask;
                n ^= jmask;
            }
            i++;
            j--;
        }
        return n;
    }
}*/
}
