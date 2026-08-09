import java.util.Arrays;
public class FirstOccurrenc {
    public static int firstOccur(int[] arr, int target){
        Arrays.sort(arr);
        int lo = 0, hi = arr.length-1, index = -1;
        while(lo<= hi){
            int mid = (lo+hi)/2;
            if(arr[mid]> target) hi = mid-1;
            else if(arr[mid]<target) lo = mid+1;
            else{
                index = mid;
                hi = mid-1;
            }
        }return index;
    }
    public static void main(String[] args) {
        int[] arr = {9,3,5,5,2,4,5,6};
        int target = 5;
        for( int num: arr){
            System.out.print(num+ " ");
        }System.out.println();
        System.out.println("Target " + target + " Found? " + firstOccur(arr,target));
        for( int num: arr){
            System.out.print(num+ " ");
        }System.out.println();
    }
    
}
