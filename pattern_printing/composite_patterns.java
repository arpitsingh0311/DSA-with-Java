// package pattern_printing;
import java.util.Scanner;
public class composite_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // Ques-1-) Print the given pattern      (Star triangle flipped )
        //                    *
        //                  * * 
        //                * * *
        //              * * * *

        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("# ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/
    


        // Ques-2-) Print the given pattern   (Number triangle flipped )
        //                    1
        //                  1 2 
        //                1 2 3
        //              1 2 3 4

        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }


        // Ques-3-) Print the given pattern   (Rhombus )
        //                    * * * * 
        //                  * * * *
        //                * * * *
        //              * * * *

        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/


        // Ques-4-) Print the given pattern   (Star Pyramid)
        //                    *
        //                  * * *
        //                * * * * *
        //              * * * * * * *

        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/


        // Ques-5-) Print the given pattern   (Number pyramid Palindrome)
        //                    1
        //                  1 2 1
        //                1 2 3 2 1
        //              1 2 3 4 3 2 1

        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            for(int j=i; j>=(2); j--){
                System.out.print(j-1 + " ");
            }
            System.out.println(" ");
        }*/


        // Ques-6-) Print the given pattern   (Star bridge)
        //               * * * * * * *
        //               * * *   * * *
        //               * *       * *
        //               *           *

        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=(2*n-1);i++){
            System.out.print("* ");
        }
        System.out.println(" ");
        int m = n-1;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i+1;j++){
                System.out.print("* ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=m-i+1;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/

       

         // Ques-7-) Print the given pattern   (Number bridge)
        //               1 2 3 4 5 6 7
        //               1 2 3   5 6 7
        //               1 2       6 7
        //               1           7

        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=(2*n-1);i++){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        int m = n-1;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i+1;j++){
                System.out.print(j+" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=m-i+1;j++){
                System.out.print(j+m+i + " ");
            }
            System.out.println(" ");
        }*/


        // Ques-8-) Print the given pattern   (Star Pyramid)
        //                    *
        //                  * * *
        //                * * * * *
        //              * * * * * * *
        //                * * * * * 
        //                  * * * 
        //                    * 

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


        // Ques-9-) Print the given pattern   (Number Spiral)
        //          1 1 1 1 1 1 1 
        //          1 2 2 2 2 2 1 
        //          1 2 3 3 3 2 1 
        //          1 2 3 4 3 2 1 
        //          1 2 3 3 3 2 1 
        //          1 2 2 2 2 2 1 
        //          1 1 1 1 1 1 1 


        // Method-1
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(Math.min(i,j) + " ");
            }
            for(int j=n-1; j>=1; j--){
                System.out.print(Math.min(i,j) + " ");
            }
            System.out.println(" ");
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n; j++){
                System.out.print(Math.min(i,j) + " ");
            }
            for(int j=n-1; j>=1; j--){
                System.out.print(Math.min(i,j) + " ");
            }
            System.out.println(" ");
        }*/

        // Method--2--
        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                int a=i, b=j;
                if(i>n) a=2*n-i;
                if(j>n) b=2*n-j;
                System.out.print(Math.min(a,b) + " ");
            }
            System.out.println(" ");
        }*/

        // Ques-10-) Print the given pattern   (Number Spiral)
        //          4 4 4 4 4 4 4
        //          4 3 3 3 3 3 4
        //          4 3 2 2 2 3 4
        //          4 3 2 1 2 3 4
        //          4 3 2 2 2 3 4
        //          4 4 4 4 4 4 4

        /*System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                int a=i, b=j;
                if(i>n) a=2*n-i;
                if(j>n) b=2*n-j;
                System.out.print((n+1 - Math.min(a,b)) + " ");
            }
            System.out.println(" ");
        }*/


        



    }
}
