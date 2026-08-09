// find Maximum value
import java.util.Scanner;
class MaximumValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.printf("Enter %d Element : ", i+1);
            arr[i] = sc.nextInt();
        }
        sc.close();
        for( int ele : arr ){
            System.out.printf("%d ",ele);
        }
        int maxx = Integer.MIN_VALUE; // Minimum values of Integer
        //System.out.println(maxx);
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > maxx){
                maxx = arr[i];
            }
        }
        System.out.println("\nMaximum Value is " + maxx);
    }
}