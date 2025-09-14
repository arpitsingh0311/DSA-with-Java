package pattern_printing;
import java.util.Scanner;
public class triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ques-1-) Print the given pattern 
        //          * 
        //          * *
        //          * * *
        //          * * * *

        /*System.out.print("Enter n : ");
        int n =sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/



        // Ques-2-) Print the given pattern 
        //          1
        //          1 2
        //          1 2 3
        //          1 2 3 4

        /*System.out.print("Enter n : ");
        int n =sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }*/

        // Ques-3-) Print the given pattern 
        //           A 
        //           A B
        //           A B C
        //           A B C D

        /*System.out.print("Enter n : ");
        int n =sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println(" ");
        }*/


        // Ques-4-) Print the given pattern 
        //           1
        //           A B
        //           1 2 3
        //           A B C D

        /*System.out.print("Enter n : ");
        int n =sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i % 2 == 0){
                    System.out.print((char)(j+64) + " ");
                } else{
                    System.out.print(j + " ");
                }   
            }
            System.out.println(" ");
        }*/

        // Ques-4-) Print the given pattern 
        //           * * * *
        //           * * * 
        //           * * 
        //           * 

        /*System.out.print("Enter n : ");
        int n =sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }*/



         // Ques-5-) Print the given pattern 
        //           1 2 3 4 
        //           1 2 3 
        //           1 2 
        //           1 

        /*System.out.print("Enter n : ");
        int n =sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }*/



        // Ques-4-) Print the given pattern 
        //           A A A A 
        //           B B B
        //           C C
        //           D

        /*System.out.print("Enter n : ");
        int n =sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println(" ");
        }*/


         // Ques-4-) Print the given pattern 
        //           E E E E E
        //           D D D D
        //           C C C
        //           B B
        //           A

        System.out.print("Enter n : ");
        int n =sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println(" ");
        }

    }
}
