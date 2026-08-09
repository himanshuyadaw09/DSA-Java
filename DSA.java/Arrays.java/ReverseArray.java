public class ReverseArray {
    static void print(int[] arr){
        for(int num: arr){
            System.out.printf("%d " , num);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.printf("Original Array: ");
        print(arr);
        int i = 0, j = arr.length - 1;
        while( i < j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.printf("Reversed Array: ");
        print(arr);
    }
    
}
