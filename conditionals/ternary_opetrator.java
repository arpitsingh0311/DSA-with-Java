package conditionals;
import java.util.Scanner;
public class ternary_opetrator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // even odd using ternary operator

        int n = sc.nextInt();

        
        System.out.println((n%2==0)? "Even" : "Odd");




    }
}
