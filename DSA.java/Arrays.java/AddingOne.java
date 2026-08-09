public class AddingOne {
    
    static int[] addOne(int[] arr){
        for(int i = arr.length-1; i >= 0; i--){
            if( arr[i] != 9){
                arr[i] += 1;
                return arr;
            }
            arr[i] = 0;
        }
        int[] result = new int[arr.length+1];
        result[0] = 1;
        for(int i = 1; i < arr.length; i++){
            result[i] = arr[i];
        }
        return result;        
    }

    public static void main(String[] args){
        //ArrayList<Integer> add1 = new ArrayList<>();
        int[] arr = {9,9,9,9,9};
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
        int[] result = new int[arr.length+1];
        result = addOne(arr);
        for(int val : result){
            System.out.print(val + " ");
        }
    }
}
