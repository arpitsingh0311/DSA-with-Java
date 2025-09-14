package M13_Arrays;
import java.util.Scanner;
public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        // initializing
        // method 1
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }  
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }  */

        // method 2
        int arr[] = {10,57,65,48,65};
        for(int i=0; i<arr.length; i++){
            System.out.println("Element "+ (i+1) + ": " + arr[i]);
        }
    }
}
