public class ReverseArray1 {
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
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length -1; j > i; j--){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.printf("Reversed Array: ");
        print(arr);
    }
    
}
