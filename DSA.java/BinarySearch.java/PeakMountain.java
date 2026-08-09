public class PeakMountain {
    static int peak(int[] arr){
        int lo = 1, hi = arr.length;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if( arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) lo = mid+1;
            else hi = mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,10,6,5,4};
        for(int num: arr){
            System.out.print(num+" ");
        }System.out.println();
        System.out.println(peak(arr));

    }
}