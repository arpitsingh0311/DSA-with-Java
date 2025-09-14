// package M45_Bit_Manupilation;
import  java.util.Scanner;

public class L2_LeftShift_RightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int x = 91;
        // Right shift
        System.out.println(x>>2);
        // Left shift 
        System.out.println(x<<2);
        */


// Ques-1-) Find 2 is to power n.

        /*int n = sc.nextInt();
        System.out.println(1<<n);*/

// Ques-2-) Swap 2 number.

        int a =10, b =15;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+" "+b);

    }
}
