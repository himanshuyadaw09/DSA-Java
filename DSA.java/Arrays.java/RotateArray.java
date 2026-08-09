public class RotateArray {
    static void reverseArray(int[] arr, int startingIndex, int endIndex){
        int i = startingIndex, j = endIndex;
        while( i < j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
    static void print(int[] arr){
        for(int num: arr){
            System.out.printf("%d " , num);
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {7,3,9,1};
        System.out.print("Original Array: ");
        print(arr);
        int r = 9;
        r = r % arr.length;
        //int[] reverseArr = reverseArray(arr,0,arr.length-1);        
        //print(reverseArr);
        // rotate array
        reverseArray(arr,0,r-1);
        reverseArray(arr,r,arr.length-1);
        reverseArray(arr,0,arr.length-1);
        System.out.print("After " + r + " The Rotated Array: ");
        print(arr);
 
    }
    
}
