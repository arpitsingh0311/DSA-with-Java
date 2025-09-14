package M22_MergeAndQuickSort;
 
public class L3_InversionCountProblem {
    static int count;
    public static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else {
                count += (a.length-i);  // extra M2
                c[k++] = b[j++];
            }
        }
        while(j<b.length) c[k++] = b[j++];
        while(i<a.length) c[k++] = a[i++];  
    }

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    // public static void inversion(int[] a, int[] b){
    //     int i=0,j=0;
    //     while(i<a.length&&j<b.length){
    //         if(a[i]>b[j]){
    //             count += (a.length-i);
    //             j++;
    //         }else i++;
    //     }
    // }

    public static void mergesort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];
        for(int i=0;i<n/2;i++){
            a[i]= arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
        //magic
        mergesort(a);
        mergesort(b);
        //inversion(a,b);  // Extrs m1
        merge(a, b, arr);
        a=null; b=null;  // for improving space complexity
    }

    public static void main(String[] args) {
        int[] arr = {86,546,24,15,98,96,45};
        print(arr);
        mergesort(arr);
        print(arr);
        System.out.println(count);
    }
}
