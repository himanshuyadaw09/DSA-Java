public class MissingInArray {
    static int arraySum(int[] arr){
        int sum = 0;
        for(int val : arr){
            sum += val;
        }
        return sum;
    }
    static int missingNum(int[] arr){
        long n = arr.length + 1;
        long sum = (n*(n+1))/2;
        long arraySum = arraySum(arr);
        return (int) (sum - arraySum);
    }
    static void print(int[] arr){
        for(int num: arr){
            System.out.printf("%d " , num);
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {8,2,4,5,3,7,1};
        System.out.print("Array: ");
        print(arr);
        System.out.println("Missing Number: " + missingNum(arr)); 

    }
    
}
