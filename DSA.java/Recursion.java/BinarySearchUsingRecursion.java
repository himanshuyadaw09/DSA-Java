public class BinarySearchUsingRecursion {
    static int helper(int[] arr, int target, int lo, int hi){
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return helper(arr,target,lo,mid-1);
        else return helper(arr,target,mid+1,hi);
    }
    static int search(int[] arr, int target){
        int n = arr.length;
        return helper(arr,target,0,n-1);

    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,38,89,457,999};
        int target = 4;
        System.out.println(search(arr,target));

    }
    
}
