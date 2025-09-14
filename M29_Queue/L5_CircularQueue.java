package M29_Queue;

public class L5_CircularQueue {

    // ARRAY IMPLEMENTATION

    public static class QueueA{
        int f =-1;
        int r =-1;
        int size = 0;
        int[] arr = new int[7];

        public void add(int val){
            if(r==arr.length-1) {
                arr[0] = val;
                r=0;
                return;
            }
            if(f==-1){
                f = r = 0;
                arr[0] = val;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }

        public int remove(){
            if(f==arr.length-1) {
                int x = arr[f];
                f=0;
                return x;
            }
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }

        public int peek(){
            return arr[f];
        }

        public boolean isEMpty(){
            if(size==0) return true;
            else return false;
        }

        public void display(){
            if(size==0){
                System.out.println("queue is empty");
            } else if(f<r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            } else if(f>r){
                for(int i=f;i<=arr.length-1;i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i=0;i<=r;i++){
                    System.out.print(arr[i] + " ");
                }
            }
        }
        
    }




    public static void main(String[] args) {
        
        // ARRAY IMPLEMENTATION 
        QueueA q = new QueueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);




    }
}
