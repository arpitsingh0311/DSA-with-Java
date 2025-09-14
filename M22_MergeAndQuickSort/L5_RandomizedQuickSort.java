package M22_MergeAndQuickSort;

public class L5_RandomizedQuickSort {

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int lo, int hi){
        int mid = (lo+hi)/2;  //
        int pivot = arr[mid], pivotIdx = mid; //
        int smallerCount =0;
        for(int i=lo+1;i<=hi;i++){
            if(i==mid) continue;  //
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIdx = lo + smallerCount;
        //swap arr[pidx] and arr[correctIdx]
        swap(pivotIdx, correctIdx, arr);
        //partition
        int i=lo, j = hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(i, j, arr);
            }
        }
        return correctIdx;
    }

    public static void quickSort(int[] arr, int lo, int hi){
        if(lo>=hi) return;
        //pivot arr[lo] lo sahi jagah rakho
        // & left part me less than pivot and right me greater
        int idx = partition(arr,lo,hi);
        quickSort(arr, lo, idx-1);
        quickSort(arr, idx+1, hi);
    }

    public static void main(String[] args) {
         
        int[] arr = {4,9,7,1,3,2,6,5,8};
        int n = arr.length;
        print(arr);
        quickSort(arr,0,n-1);
        print(arr);

    }
}
