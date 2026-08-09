public class Merge2SortedArrays {

    static int[] mergeTwoArrays(int[] arr1, int[] arr2,int n){
        int[] ans = new int[n];
        int i = 0, j = 0, k = 0;
        while( (i < arr1.length) && (j < arr2.length)){
            if( arr1[i] >= arr2[j]){
                ans[k] = arr2[j];
                j++;
            }else if( arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++;
            }
            k++;
        }
        if( i == arr1.length){
            while(j < arr2.length){
                ans[k++] = arr2[j++];
            }
        }else{
            while( i < arr1.length ){
                ans[k++] = arr1[i++];
            }
        }
        return ans;        
    }
    
    static void print(int[] arr){
        for(int num: arr){
            System.out.printf("%d " , num);
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr1 = {2,5,6,9,20};
        int[] arr2 = {1,3,4,5,7,8};
        int n = arr1.length + arr2.length;
        int[] answer = new int[n];
        answer = mergeTwoArrays(arr1,arr2,n);
        print(arr1);
        print(arr2);
        print(answer);

    }
}