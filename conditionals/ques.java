package conditionals;
import java.util.Scanner;

public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ques-1-) if CP and SP of an item is input through the keyboard,  write a program  to determine the seller has made profit or incurred loss or no profit no loss. Also determine how much profit he made or loss he incurred.
        
        /*System.out.print("Enter CP : ");
        int cp = sc.nextInt();
        System.out.print("Enter SP : ");
        int sp = sc.nextInt();
        if(cp > sp){
            System.out.println("Profit");
        } else if(cp < sp){
            System.out.println("Loss");
        } else{
            System.out.println("No profit no loss");
        }
        int n;
        n = cp - sp;
        System.out.print("How much : ");
        if(n <= 0){
            System.out.println(-n);
        } else{
            System.out.println(n);
        }*/
        

        // ques-2-)take input percentage of a student and print the grade according to marks   81-100 very-good 61-80 good  41-60  average  <=40  fail 
        
        /*System.out.print("Enter the marks : ");
        int n = sc.nextInt();
        
        if(n>=81 && n<=100){
            System.out.println("Very Good");
        } else if(n>=61){
            System.out.println("Good");
        } else if(n>=41){
            System.out.println("Average");
        } else{
            System.out.println("Fail");
        }*/

        // ques-3-) take three numbers as input and tell if they can be the sides of a triangle.

        System.out.print("Enter first side : ");
        int a = sc.nextInt();
        System.out.print("Enter second side : ");
        int b = sc.nextInt();
        System.out.print("Enter third side : ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Valid Triangle");
        } else{
            System.out.println("Invalid triangle");
        }



    }
}
