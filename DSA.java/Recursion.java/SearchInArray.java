public class SearchInArray {
    static boolean exists(int[] arr, int ele, int idx){
        if(idx == arr.length) return false;
        if(arr[idx] == ele) return true;
        return exists(arr,ele,idx+1);        
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,23,46,77,377,24,34,67,8,8,99,25};
        System.out.println(exists(arr, 77, 0));

    }
    
}
