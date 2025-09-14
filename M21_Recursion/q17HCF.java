package M21_Recursion;
import java.util.Scanner;
public class q17HCF {


    public static int HCF(int a, int b){
        // for(int i=Math.min(a,b);i>=1;i--){
        //     if(a%i==0 && b%i==0) return i;
        // }
        // return 1;
        
        //recursive
        int temp = a%b;
        if(temp==0) return b;
        return HCF(b,temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b =sc.nextInt();
        System.out.println(HCF(a,b));





    }
}
