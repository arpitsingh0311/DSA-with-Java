public class L13_XORinRange {
    

// Ques-17-) XOR of number in a given range.

// METHOD -1-) QUES OF GFG

/*class Solution{
    public int getXor(int[] nums, int a, int b){
        // Code here
        int XOR = 0;
        for(int i=a;i<=b;i++){
            XOR ^= nums[i];
        }
        return XOR;
    }
}*/


// METHOD -2-) RANGE IS COUNTINOUS RANGE OF INTEGERs from L to R

    public static int XOR(int n){
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        if(n%4==3) return 0;
        if(n%4==0) return n;
        return -1;
    }

    public static void main(String[] args) {
        int L = 45, R = 56;
        int ans = XOR(L-1)^XOR(R);
        System.out.println(ans);
    }


}
