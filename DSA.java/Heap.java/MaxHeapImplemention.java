class MaxHeap {
    private int[] arr;
    private int idx = 1;
    MaxHeap(int capacity){
        arr = new int[capacity+1];
    }

    int size(){
        return idx - 1;
    }
    void add(int ele){
        if(idx == arr.length){
            System.out.println("Heap is Full!");
            return;
        }
        arr[idx++] = ele;
        // Rearrengment
        int root = idx-1;
        while(root != 1){
            int parent = root/2;
            if(arr[root] > arr[])
        }

    }
}

public class MaxHeapImplemention {
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(10);
    }    
}
