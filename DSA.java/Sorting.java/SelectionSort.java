public class SelectionSort {
    public static void selectionSort(int[] nums){
        int n = nums.length;
        for( int i = 0; i < n-1; i++){
            int min = Integer.MAX_VALUE, mindex = -1;
            for( int j = i; j < n; j ++){
                if( nums[j] < min){
                    min = nums[j];
                    mindex = j;
                }
            }
            int temp = nums[i];
            nums[i] = min;
            nums[mindex] = temp;
        }
    }

    static void print(int[] arr){
        for( int num: arr){
            System.out.print(num + " ");            
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] nums = {5,-2,6,7,2,0,7,2};
        print(nums);
        selectionSort(nums);
        print(nums);
    }
    
}
