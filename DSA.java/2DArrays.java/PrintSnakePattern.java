public class PrintSnakePattern {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7}, {7,2,1,6,3}, {5,5,4,1,4}, {3,1,8,2,6}};
        int n = arr.length, m = arr[0].length;
        
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                for(int j = 0; j < m; j++){
                    System.out.print(arr[i][j] + " ");
                }System.out.println();
            }else{
                for(int j = m-1; j >=0; j--){
                    System.out.print(arr[i][j] + " ");
                }System.out.println();
            }        
        }
    }
    
}
