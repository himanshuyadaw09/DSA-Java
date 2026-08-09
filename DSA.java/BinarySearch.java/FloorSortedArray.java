public class FloorSortedArray {
    static int floor(int[] arr, int x){
        int lo = 1, hi = arr.length, index = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > x) hi = mid-1;
            else{
                index = mid;
                lo = mid+1;
            }

        }
        return index;
    }
    public static void main(String[] args){
        int[] arr = {1,2,8,10,10,12,19};
        int x = 11;
        for(int num: arr){
            System.out.print(num+" ");
        }System.out.println();
        System.out.println(floor(arr,x));

    }
}