public class MissingNumber {
    static int missingNumber(int[] arr){
        // int n-1 = arr.length    ele: 1 to n
        int n = 1 + arr.length;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == i+1 || arr[i] == n) i++;
            else{
                int idx = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for(i = 0; i < arr.length; i++){
            if(arr[i] != i+1) return i+1;
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,6,9,7,8};
        System.out.println(missingNumber(arr));

    }
    
}
