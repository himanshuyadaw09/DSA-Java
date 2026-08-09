public class FirstOccures {
    static int helper(int[] arr, int target, int lo, int hi){
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(arr[mid] == target){
            int leftAns = helper(arr,target,lo,mid-1);
            if(leftAns != -1) return leftAns;
            else return mid; 
        }else if(arr[mid] > target) return helper(arr,target,lo,mid-1);
        else return helper(arr,target,mid+1,hi);
        //return ans;
    }
    static int firstOcc(int[] arr, int target, int idx){
        int n = arr.length;
        return helper(arr,target,idx,n-1);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,8,8,9,38,89,457,999};
        int target = 8;
        System.out.println(firstOcc(arr, target, 0));

    }
    
}
