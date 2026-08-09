public class ReverseArray {
    static void helper(int[] arr, int idx, int lastidx){
        if(idx>lastidx) return;
        int temp = arr[idx];
        arr[idx] = arr[lastidx];
        arr[lastidx] = temp;
        helper(arr,idx+1,lastidx-1);
    }
    static void reverse(int[] arr, int idx){
        int n = arr.length;
        helper(arr,idx,n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5 };
        reverse(arr,0);
        for(int ele: arr){
            System.out.print(ele + " ");
        }

    }
    
}
