public class LinearSearch {
    static void search(int[] arr, int k){
        boolean flag = false;
        for(int val : arr){
            if( val != k ){
                continue;
            }
            else{
                flag = true;
                break;
            }            
        }
        if(flag){
            System.out.println("Exists!");
        }else{
            System.out.println("Not Exists!");
        }
    }
    public static void main(String[] args){
        int[] arr = {3,3,5,63,43,6,64,70,80};
        int target = 3;
        search(arr,target);
        
    }
    
}
