import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args){
        int[] arr = {2,3,4,6,4,2,3,5,7,4,3,3,2,};
        for(int val : arr){
            System.out.printf("%d ", val);
        }
        System.out.println();
        Arrays.sort(arr);
        for(int val: arr){
            System.out.printf("%d ", val);
        }
    }
    
}
