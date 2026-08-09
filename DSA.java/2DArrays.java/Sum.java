public class Sum {
    public static void main(String[] args) {
        int[][] arr = {{06,05,5,8}, {0,01,05,9}, {05,10,20,30}};
        int sum = 0, n = arr.length, m = arr[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
    
}
