// import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {2,3,3,5,6,3,6,6,3,10,15};
        int maxx = arr[0];
        int secMaxx = arr[0];
        // int n = arr.length;
        for( int val : arr){
            if( val > maxx){
                secMaxx = maxx;
                maxx = val;
            }else if(val > secMaxx){
                secMaxx = val;
            }
        }
        System.out.println("Largest Element: " + maxx);
        System.out.println("Second Largest Element: " + secMaxx);
        
    }
    
}
