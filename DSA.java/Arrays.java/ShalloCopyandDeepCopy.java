import java.util.Arrays;

class ShalloCopyandDeepCopy {
    public static void main(String[] args){
        int[] arr = {2,5,6,7,8,10};
        int[] x = arr;
        x[0] = 20;
        System.out.println("Shallow Copy Example: " + arr[0]);

        // Deep Copy
        int[] y = Arrays.copyOf(arr,arr.length);
        y[0] = 100;
        System.out.println("Deep Copy Example: " + arr[0]);
    }
}