class MinHeap {
    private int[] arr;
    private int idx = 1;

    MinHeap(int capacity){
        arr = new int[capacity+1];
    }
    
    int size(){
        return idx-1;
    }

    void add(int ele){
        if(idx == arr.length){
            System.out.println("Heap is Full!");
            return;
        }
        arr[idx++] = ele;
        // Rearrengement
        int root = idx - 1;
        while(root != 1){
            int parent = root / 2;
            if(arr[root] < arr[parent]){
                int temp = arr[root];
                arr[root] = arr[parent];
                arr[parent] = temp;
                root = parent;
            }
            else 
                break;
        }
    }

    int remove(){
        if(size() == 0){
            System.out.println("Heap is Empty!");
            return -1;
        }
        int removedEle = arr[1];
        arr[1] = arr[idx-1];
        idx--;
        // rearrengement
        int root = 1;
        while(root <= size()){
            int left = 2*root, right = 2*root + 1;
            int leftVal = (left <= size()) ? arr[left] : Integer.MAX_VALUE;
            int rightVal = (right <= size()) ? arr[right] : Integer.MAX_VALUE;
            if(arr[root] < leftVal && arr[root] < rightVal) break;
            else{
                if(leftVal < rightVal){ // left child se swap karna hai
                    int temp = arr[root];
                    arr[root] = arr[left];
                    arr[left] = temp;
                    root = left;
                }
                else{ // leftVal > rightVal
                    int temp = arr[root];
                    arr[root] = arr[right];
                    arr[right] = temp;
                    root = right;
                }
            }
        }
        return removedEle;
    }

    int peek(){
        if(size() == 0){
            System.out.println("Heap is Empty!");
            return -1;
        }
        return arr[1];
    }

    void display(){
        for(int i = 1; i < idx; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class MinHeapImplemention {

    public static void main(String[] args) {
        MinHeap h = new MinHeap(10);
        h.add(10); h.add(15); h.add(8); h.add(9); h.add(4);
        h.display(); 
        System.out.println("Size: " + h.size());
        System.out.println("Peek: " + h.peek());
        h.remove();
        h.display();
        h.add(2);
        h.display();
        System.out.println("Removed Element: " + h.remove());
        h.display();
    }
}
