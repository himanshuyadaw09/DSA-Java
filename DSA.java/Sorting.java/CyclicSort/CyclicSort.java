public class CyclicSort {
    public static void cyclicSort(int[] arr){
        int i = 0, n = arr.length;
        while(i<n){
            if(arr[i] == i) i++;
            else{
                int idx = arr[i];
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,1,3,6,2,4,0,7};
        for(int ele: arr){
            System.out.print(ele+" ");
        }System.out.println();
        cyclicSort(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }System.out.println();
    }
    
}
