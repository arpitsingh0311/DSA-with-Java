package conditionals;
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Absolute number : ");
        if(n <= 0){
            System.out.println(-n);
        } else{
            System.out.println(n);
        }


    }
}
