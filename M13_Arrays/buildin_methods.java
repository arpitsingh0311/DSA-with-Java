package M13_Arrays;
import java.util.Arrays;

public class buildin_methods {
    public static void main(String[] args) {
        int[] arr = {30,64,45,25,16,68};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        // sorting in array

        /*Arrays.sort(arr); 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }*/


        // copy of array

        int[] nums = arr; // shallow copy
        nums[0] = 70;
        for(int ele : nums){
            System.out.print(ele + " ");
        }
        System.out.println("\n" + arr[0]);

        // deep copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[1] = 90;
        for(int ele : brr){
            System.out.print(ele + " ");
        }










    }
}
