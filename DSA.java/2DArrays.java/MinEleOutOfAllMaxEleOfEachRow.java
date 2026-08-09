public class MinEleOutOfAllMaxEleOfEachRow {
    public static void main(String[] args){
        int[][] arr = {{2,8,3,4,7}, {7,2,1,6,3}, {5,9,4,1,4}, {3,1,8,2,6}};
        int minEle = Integer.MAX_VALUE, n = arr.length, m = arr[0].length;
        for(int i = 0; i < n; i++){
            int max = arr[0][0];
            for(int j = 0; j < m; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            if(max < minEle) minEle = max;
        }
        System.out.println("Minimum Element Out Of All The Maximum Element of each row: " + minEle);
    }
}
