// package M45_Bit_Manupilation;

public class L5_SetKthBit {

// Ques-5-) GFG   Turn On / Set the kth bit    

// METHOD-1  OR OPERATOR

/*
class Solution {
    static int setKthBit(int n, int k) {
        return n|(1<<k);
    }
}
*/

// Ques-6-) Turn off/Clear the kth bit  

// Mask with 1111011111
/*
class Solution {
    static int offKthBit(int n, int k) {
        return n|(~(1<<k));
    }
}
*/

// Ques-7-) Toggle kth bit.

/*
class Solution {
    static int offKthBit(int n, int k) {
        return n^(1<<k);
    }
}
*/


// Ques-8-) GFG Toggle bits in the given range

// (1 << (R - L + 1)) - 1 creates a sequence of 1s for the required bit range.
// << (L - 1) shifts the 1s to the correct position.

/*class Solution {
    static int toggleBits(int N, int L , int R) {
        int mask = ((1 << (R - L + 1)) - 1) << (L - 1);
        return N ^ mask;
    }
};*/

}
