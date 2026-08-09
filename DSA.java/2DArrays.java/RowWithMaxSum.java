public class RowWithMaxSum {
    public static void main(String[] args){
        int[][] arr = {{2,8,3,4,7}, {7,2,1,6,3}, {5,5,4,1,4}, {3,1,8,2,6}};
        int maxIdx = -1, n = arr.length, m = arr[0].length, maxSum = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                maxIdx = i;
            }
        }
        System.out.println("Maximum Sum Index is: "+ maxIdx);
        System.out.println("Maximum Sum  is: "+ maxSum);
    }
    
}
