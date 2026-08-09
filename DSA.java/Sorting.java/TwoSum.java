import java.util.Arrays;

public class TwoSum {

    static boolean twoSum(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0, j = arr.length-1 ;
        while(i<j){
            if(arr[i] + arr[j] == target) return true;
            else if(arr[i] + arr[j] > target) j--;
            else if(arr[i] + arr[j] < target) i++;            
        }return false;
    }
    public static void main(String[] args){
        int[] arr = {1,4,45,6,10,8};
        int target = 16;
        for( int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Target " + target + " is found? "+ twoSum(arr,target));
        
    }
}