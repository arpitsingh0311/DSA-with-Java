// package M45_Bit_Manupilation;

public class L6_RightmostSetBit {
    public static void main(String[] args) {
        
// Ques-9-) Turn off the Rightmost set bit.

        int a = 36;

    // METHOD-1  T.C. = O(logn)
        /*int b=a,k=0;
        while(b%2==0){
            b = b>>1;
            k++;
        }
        System.out.println(a&(~(1<<k)));  // 32
        */

    // METHOD-2 T.C. = O(1)
    //    36 = 100100
    //    35 = 100011
    // 36&35 = 100000 = 32
    
        System.out.println(a&(a-1));
        
    }
}
