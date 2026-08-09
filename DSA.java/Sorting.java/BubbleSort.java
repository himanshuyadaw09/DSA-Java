public class BubbleSort {
    static void bubbleSort(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n-1; i++){ // n-1 passes
            boolean isSorted = true;
            for( int j = 0; j < n-1-i; j++){ // n-1-i passes
                if( nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSorted = false;
                }
            }if(isSorted){
                return;
            }
        }
    }

    static void print(int[] nums){
        for(int val: nums){
            System.out.print(val + " ");            
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] nums = {5,-2,6,7,3,0,7,2};
        print(nums);
        bubbleSort(nums);
        print(nums);

    }
}