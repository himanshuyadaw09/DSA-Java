public class InversionCount {
    static int count;
    static void merge(int[] nums, int[] a, int[] b){
        int i = 0, j = 0, k = 0;
        while((i < a.length) && (j < b.length)){
            if(a[i] <= b[j]) nums[k++] = a[i++];
            else {
                count += (a.length-i);
                nums[k++] = b[j++];
            }
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
    static void mergeSort(int[] nums){
        int n = nums.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];        
        int idx = 0;
        for(int i = 0; i < a.length; i++) a[i] = nums[idx++];
        for(int i = 0; i < b.length; i++) b[i] = nums[idx++];        
        mergeSort(a);
        mergeSort(b);        
        merge(nums,a,b);
    }

    static int inversionCount(int[] arr){
        count = 0;
        mergeSort(arr);
        return count;        
    }
    public static void main(String[] args) {
        int[] arr = {2,5,4,1,3,5};
        System.out.println(inversionCount(arr));        
    }
    
}
