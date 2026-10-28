import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallestElement {
    // Time Complexity: nlogk + (n-k)logk => O(nlogk);
    public static int kthsmall(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums){
            pq.add(num);
            if(pq.size() > k) pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(kthsmall(nums, 2));

    }
}
