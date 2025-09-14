package M13_Arrays;

public class arr_to_methods {
    public static void main(String[] args) {
        int x =5;
        System.out.println(x);
        change_1(x);
        System.out.println(x);
        int[] arr = {10,20,30,40};
        System.out.println(arr[0]);
        change_2(arr);
        System.out.println(arr[0]);
    }

    
    public static void change_1(int x){
        x = 10;
    }

    public static void change_2(int[] arr){
        arr[0] = 90;
    }
    









}
