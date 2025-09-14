package M14_MultidimentionalArray;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int grid[][] = new int[3][2];
        int m = grid.length;  //no. of rows
        int n = grid[0].length;  //no. of columns
        System.out.println(m +","+ n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter Element (" + i + "," + j + ") : ");
                grid[i][j] = sc.nextInt();
            }
            
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        























    }


}
