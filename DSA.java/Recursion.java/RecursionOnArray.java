public class RecursionOnArray {
    static void recPrint(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx]+" ");
        recPrint(arr,idx+1);
    }
    static void recPrint2(int[] arr, int idx){
        if(idx == arr.length) return;        
        recPrint(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,24,63,67,23,34,6};
        recPrint(arr,0);
        System.out.println();
        recPrint2(arr,0);

    }
    
}
