import java.util.Scanner;

public class Basic {
    public static void main(String[] args){
        //int[][] arr = new int[3][4]; 
        // int[][] arr = {{06,05,5,8}, {0,01,05,9}, {05,10,20,30}};
        // int n = arr.length, m = arr[0].length; // n - number of rows and m - number of column
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column: ");
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr2 = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}