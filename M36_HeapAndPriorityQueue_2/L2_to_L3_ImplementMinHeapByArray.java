// package M36_HeapAndPriorityQueue_2;

// Ques-1-) Implement a MinHeap by Array.

class MinHeap{
    private int[] arr;
    private int size;
    MinHeap(int n){
        arr = new int[n];
        size = 0;
    }
    public void add(int num) throws Exception{
        if(size==arr.length) throw new Exception("Heap is Full!");
        arr[size++] = num;
        upheapify(size-1);
    }
    public int remove() throws Exception{
        if(size==0) throw new Exception("Heap is Full!");
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public int peek() throws Exception{
        if(size==0) throw new Exception("Heap is Empty!");
        return arr[0];
    }
    public void upheapify(int i){
        if(i==0) return;
        int parent = (i-1)/2;
        if(arr[i]<arr[parent]){
            swap(i,parent);
            upheapify(parent);
        }
    }
    public void downHeapify(int i){
        if(i>=size) return;
        int lc = 2*i+1 , rc = 2*i+2;
        int minIdx = i;
        if (lc<size && arr[lc]<arr[minIdx]) minIdx =lc;
        if (rc < size && arr[rc] < arr[minIdx])minIdx = rc;
        if(i==minIdx) return;
        swap(i,minIdx);
        downHeapify(minIdx);
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int size(){
        return size;
    }
}

public class L2_to_L3_ImplementMinHeapByArray {
    public static void main(String[] args) throws Exception{
        MinHeap pq = new MinHeap(10);
        // System.out.println(pq.peek());
        pq.add(1);
        pq.add(6);
        pq.add(5);
        pq.add(2);
        pq.add(9);
        // while(pq.size()>0){
        //     System.out.print(pq.remove());
        // }
        System.out.println(pq.size() + " " + pq.peek());
        pq.add(0);
        System.out.println(pq.size() + " " + pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        pq.add(-5);
        System.out.println(pq.peek());




    }
}



// Ques-2-) Implement a MaxHeap by Array.


