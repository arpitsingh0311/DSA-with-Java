package pattern_printing;
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ques-1-) print this given pattern
        //              *****
        //              *****
        //              *****
        //              *****

        /*System.out.print("Enter number of rows :");
        int n = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int m = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println("");
        }*/


        // Ques-2-) print this given pattern
        //             ABCD
        //             ABCD
        //             ABCD
        //             ABCD

        /*System.out.print("Enter number of rows :");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<=n; j++){
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println("");
        }*/

        // Ques-3-) print this given pattern
        //             A A A A
        //             B B B B
        //             C C C C
        //             D D D D

        /*System.out.print("Enter number of rows :");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<=n; j++){
                System.out.print((char)(i+64)+ " ");
            }
            System.out.println("");
        }*/

        // Ques-4-) print this given pattern
        //             a b c d
        //             a b c d
        //             a b c d
        //             a b c d

        /*System.out.print("Enter number of rows :");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<=n; j++){
                System.out.print((char)(j+96)+ " ");
            }
            System.out.println("");
        }*/

    }
}
