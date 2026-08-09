public class SingleAmongDoubles {
    static int singleAmongDouble(int[] nums){
        int n = nums.length;
        if(n==1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            int f = mid, s = mid;
            if(nums[mid-1] == nums[mid]) f = mid-1;
            else s = mid+1;
            int leftCount = f - low;
            //int rightCount = high - s;
            if(leftCount % 2 == 0) low = s+1;
            else high = f-1;
        }return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
        for(int num: arr){
            System.out.print(num + " ");
        }System.out.println();
        System.out.println("Single Element is "+ singleAmongDouble(arr));
    }
    
}
