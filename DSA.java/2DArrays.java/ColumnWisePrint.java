public class ColumnWisePrint {
    public static void main(String[] args){
        int[][] arr = {{2,8,3,4,7}, {7,2,1,6,3}, {5,9,4,1,4}, {3,1,8,2,6}};
        int n = arr.length, m = arr[0].length;
        int j = 0;
        while(j < m){
            for(int i = 0; i < n; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            j++;
        }
    }
    
}
