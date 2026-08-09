import java.util.ArrayList;
// import java.util.Arrays;

public class FirstLastOccur {
    public static int firstOccur(int[] arr, int target){
        //Arrays.sort(arr);
        int lo = 0, hi = arr.length-1, first = -1;
        while(lo<= hi){
            int mid = (lo+hi)/2;
            if(arr[mid]> target) hi = mid-1;
            else if(arr[mid]<target) lo = mid+1;
            else{
                first = mid;
                hi = mid-1;
            }
        }return first;
    }public static int lastOccur(int[] arr, int target){
        //Arrays.sort(arr);
        int lo = 0, hi = arr.length-1, last = -1;
        while(lo<= hi){
            int mid = (lo+hi)/2;
            if(arr[mid]> target) hi = mid-1;
            else if(arr[mid]<target) lo = mid+1;
            else{
                last = mid;
                lo = mid+1;
            }
        }return last;
    }
    static ArrayList<Integer> firstLastOccur(int[] nums, int target){
        int first = firstOccur(nums, target);
        int last = lastOccur(nums,target);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(first);
        ans.add(last);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,4,4,4,4,4,4,5,6,7,8,27,245};
        for(int num: nums){
            System.out.print(num+" ");
        }System.out.println();
        int target = 4;
        ArrayList<Integer> ans = new ArrayList<>();
        ans = firstLastOccur(nums,target);
        System.out.println(ans);

    }
    
}
