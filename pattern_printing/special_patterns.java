package pattern_printing;
import java.util.Scanner;
public class special_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ques-1-) Print the given pattern
        //            1
        //            1 3
        //            1 3 5
        //            1 3 5 7
        
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((2*j-1) + " ");
            }
            System.out.println(" ");
        }*/


        // Ques-2-) Print the given pattern   (Floyd's Triangle)
        //               (Imp question )
        //            1
        //            2 3
        //            4 5 6
        //            7 8 9 10
        
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        int a=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println(" ");
        }*/


        // Ques-3-) Print the given pattern   (Star Plus)
        //               n is odd
        //                *   
        //                *   
        //            * * * * * 
        //                *   
        //                *   
                   
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i % ((n+1)/2) == 0 || j % ((n+1)/2)==0){
                    System.out.print("*" + " ");
                } else{
                    System.out.print(" " +" ");
                }
            }
            System.out.println(" ");
        }*/



        // Ques-4-) Print the given pattern   (Star cross)
        //               n is odd
        //             *       *
        //               *   *
        //                 * 
        //               *   *  
        //             *       *
                   
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i == j || i+j == n+1 ){
                    System.out.print("*" + " ");
                } else{
                    System.out.print(" " +" ");
                }
            }
            System.out.println(" ");
        }*/



        // Ques-5-) Print the given pattern   (Binary Triangle)
        //              1
        //              01
        //              101
        //              0101
         
                   
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2==1 && j%2==1){
                    System.out.print("1" + " ");
                } else if(i%2==0 && j%2==0){
                    System.out.print("1" + " ");
                } else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println(" ");
        }*/


        // Ques-6-) Print the given pattern   (Star triangle flipped )
        //                    *
        //                  * * 
        //                * * *
        //              * * * *
                   
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j> n){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }*/


    }
}
