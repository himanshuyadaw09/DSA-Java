import java.util.Scanner;
public class MinimumValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Enter %d Element: ", i+1);
            arr[i] = sc.nextInt();
        }
        sc.close();
        int minn = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < minn){
                minn = arr[i];
            }
        }
        System.out.println("Minimum Value: " + minn);
    }
    
}
