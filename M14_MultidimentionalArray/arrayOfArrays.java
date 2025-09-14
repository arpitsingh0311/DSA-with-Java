package M14_MultidimentionalArray;
import java.util.Scanner;
public class arrayOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a ={{4,5,6},{7,8,9}};
        for(int[] ele : a){
            for(int x :ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }














    }
}
