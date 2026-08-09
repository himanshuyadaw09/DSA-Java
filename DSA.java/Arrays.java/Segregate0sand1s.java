public class Segregate0sand1s {

    static void segregate(int[] arr){
        // Two Pass Sloution---
        long n = arr.length;
        int count = -1;
        for(int i = 0; i < n; i++){
            if( arr[i] != 1){
                count += 1;
            }
        }
        if(count != -1){
            for(int i = 0; i <= count; i++){
                arr[i] = 0;
            }
            for(int i = count + 1; i < n; i++){
                arr[i] = 1;
            }
        }else{
            return ;
        }
        return;
    }
    static void print(int[] arr){
        for(int num: arr){
            System.out.printf("%d " , num);
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {1,0,0,1,1,1,0,1,0,1,1,0};
        System.out.print("Original Array: ");
        print(arr);
        segregate(arr);
        System.out.print("Final Array: ");
        print(arr);
        

    }
    
}
