package loops;
import java.util.Scanner;
public class composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // WAP to check if a number is composite or not.

        //Break 


        /*System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int x =0;
        for(int i=2; i<=n; i++){
            if(n % i == 0){
                System.out.println("Composite number");  
                x =1;
            break;
            } 
        }
        if(n==1) System.out.println("neither prime nor composite");
        else if(x==0) System.out.println("Prime Number");*/

        // Continue

        // Write a program to print odd numbers from 1 to 100.

        for(int i=1; i<=100; i++){
            if(i%2 == 0){
                continue;
            }
            System.out.println((i));
        }
   
    }
}
