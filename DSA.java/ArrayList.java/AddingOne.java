import java.util.*;

public class AddingOne {
    
    static Vector<Integer> addOne(int[] arr){        
        boolean flag = false;
        for(int i = arr.length-1; i >= 0; i--){
            if( arr[i] != 9){
                arr[i] += 1;
                flag = true;
                break;
            }
            arr[i] = 0;
        }
        Vector<Integer> ans = new Vector<>();        
        if( flag ){
            for(int num: arr){
                ans.add(num);
            }
        }else{
            int[] result = new int[arr.length+1];
            result[0] = 1;
            for(int i = 0; i < arr.length; i++){
                result[i+1] = arr[i];
            }
            for(int num: result){
                ans.add(num);
            }
        }
        return ans;        
    }

    public static void main(String[] args){
        //ArrayList<Integer> add1 = new ArrayList<>();
        int[] arr = {5,9,9,9,9};
        Vector<Integer> add = new Vector<>();
        for(int num: arr){
            add.add(num);
        }
        System.out.print(add);
        System.out.println();
        Vector<Integer> answer = new Vector<>();
        answer = addOne(arr);
        System.out.println(answer);
    }
}
