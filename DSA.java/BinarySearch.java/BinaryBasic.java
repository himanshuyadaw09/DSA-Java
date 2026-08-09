import java.util.Arrays;

public class BinaryBasic {

    static boolean binarySearch(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0, right = arr.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if( arr[mid] == target){
                return true;
            }else if( arr[mid] < target){
                left = mid+1;
            }else
                right = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {9,3,5,62,75,84,24,47757,3,424,235,5,77,73,52454,34,24};
        int target = 5;
        for( int num: arr){
            System.out.print(num+ " ");
        }System.out.println();
        System.out.println("Target " + target + " Found? " + binarySearch(arr,target));
    }
}
 