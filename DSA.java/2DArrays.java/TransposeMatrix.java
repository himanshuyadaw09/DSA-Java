public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4}, {7,2,1,6}, {5,9,4,1}, {3,1,8,2}};
        for(int[] a: arr){
            for(int ele: a){
                System.out.print(ele + " ");
            }System.out.println();
        }System.out.println();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <=i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int[] a: arr){
            for(int ele: a){
                System.out.print(ele + " ");
            }System.out.println();
        }
    }
    
}
