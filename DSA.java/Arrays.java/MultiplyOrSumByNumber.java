public class MultiplyOrSumByNumber {
    static void print(int[] arr){
        for(int num: arr){
            System.out.printf("%d " , num);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {3,5,2,4,6,7,20,28,10};
        System.out.print("Initial array: ");
        print(arr);
        for(int i = 0; i < arr.length; i++){
            if( i % 2 == 0){
                arr[i] += 10;
            }
            else{
                arr[i] *= 2;
            }
        }
        System.out.print("Required Array: ");
        print(arr);


    }
    
}
