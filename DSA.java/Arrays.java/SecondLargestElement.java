// import java.util.Arrays;

public class SecondLargestElement {
    public static int getSecondLargest(int[] arr) {
        int firstMax = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstMax){
                secMax = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i] > secMax && arr[i] != firstMax){
                secMax = arr[i];
            }
        }
        return (secMax == Integer.MIN_VALUE)? -1:secMax;
    }
    public static void main(String[] args){
        int[] arr = {2,3,3,5,6,3,6,6,3,10,15};
        System.out.println(getSecondLargest(arr));
    }
    
}
