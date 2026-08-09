public class MergeSort {
    static void merge(int[] nums, int[] a, int[] b){
        int i = 0, j = 0, k = 0;
        while((i < a.length) && (j < b.length)){
            if(a[i] <= b[j]) nums[k++] = a[i++];
            else nums[k++] = b[j++];
        }
        if(i==a.length){
            while(j<b.length){
                nums[k++] = b[j++];
            }
        }
        if(j==b.length){
            while(i<a.length){
                nums[k++] = a[i++];
            } 
        }
    }
        // Time complexity : O(n*log(n))  A.S = O(n*log(n))
        // Merge sort are faster and stable
    static void mergeSort(int[] nums){
        int n = nums.length;
        if(n==1) return; // 1 length array is pehle se sorted
        // Step 1: create 2 new empty array of size n/2 each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // step 2: copy past nums into a and b
        int idx = 0;
        for(int i = 0; i < a.length; i++) a[i] = nums[idx++];
        for(int i = 0; i < b.length; i++) b[i] = nums[idx++];
        // Step 3: Magic
        mergeSort(a);
        mergeSort(b);
        // Step 4: Merge 'a' and 'b' into nums
        merge(nums,a,b);
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,2,4,9,8,0,-1};
        for(int ele: nums){
            System.out.print(ele+" ");
        }System.out.println();
        mergeSort(nums);
        for(int ele: nums){
            System.out.print(ele+" ");
        }System.out.println();
    }
    
}
