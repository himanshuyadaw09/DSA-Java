public class InsertionSort {

    static void insertionSort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int j = i;
            while( j > 0 && nums[j] < nums[j-1] ){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
    }

    static void print(int[] arr){
        for( int num: arr){
            System.out.print(num+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] nums = {4,1,7,3,9,1,0,8};
        print(nums);
        insertionSort(nums);
        print(nums);
    }
    
}
