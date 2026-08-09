public class MaximumCountOfPositiveAndNegative {
    static int postiveCount(int[] nums){
        int lo = 0, hi = nums.length-1, posCount = 0;
        // while(lo<=hi){
        //     int mid = lo + (hi-lo)/2;            
        //     if(nums[mid] >= 0) hi = mid-1;
        //     else{
        //         negCount = mid+1;
        //         lo = mid+1;
        //     }

        // }
        int zeroIndex = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] <= 0){
                zeroIndex = mid;
                lo = mid+1;
            }
            // //else if( nums[mid] == 0){
            //     //zeroIndex = mid;
            //     //lo = mid+1;
            // }
            else{
                posCount = mid+1;
                lo = mid+1;
            }
        }
        //if( negCount > (posCount-zeroIndex)) return negCount;
        return (posCount-zeroIndex);
    }
    public static void main(String[] args){
        int[] nums = {-1,0,2,3,15,166,1535};
        for(int num: nums){
            System.out.print(num + " ");
        }System.out.println();
        System.out.println("Maximum Count of Postive Integer is: "+postiveCount(nums));

    }
    
}
