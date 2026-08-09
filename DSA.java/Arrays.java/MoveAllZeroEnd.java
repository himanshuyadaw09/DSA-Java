public class MoveAllZeroEnd {
    static void moveZero(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(nums[j] == 0){
                    nums[j] = nums[j+1];
                    nums[j+1] = 0;
                }
            }
        }
    }
    static void moveZero2(int[] nums){
        int n = nums.length, j = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                if(i != j){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    
                }
                j++;
            }
        }
    }
    static void print(int[] arr){
        for( int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] nums = {1,0,-2,3,0,4,0,0,10,12};
        print(nums);
        moveZero2(nums);
        print(nums);


    }
    
}
