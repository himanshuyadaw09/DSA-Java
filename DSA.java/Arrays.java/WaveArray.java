public class WaveArray {

    static void waveArray(int[] arr){
        // int n = arr.length;
        for(int i = 0; i < arr.length-1; i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    static void print(int[] arr){
        for(int num: arr){
            System.out.printf("%d " , num);
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.print("Original Array: ");
        print(arr);
        waveArray(arr);
        System.out.print("Wave Array: ");
        print(arr);
    }
    
}
