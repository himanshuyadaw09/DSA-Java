import java.util.*;

public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number: ");
        int n = sc.nextInt();
        sc.close();
        String s = Integer.toString(n);
        //String s = "";
        //s += n;
        System.out.println("Number of Digits: " + s.length());
        

        // String to Integer
        String str1 = "64534631";
        int num = Integer.parseInt(str1);
        System.out.println(num+1);

/*
        String str = "Himanshu";
        char[] arr = str.toCharArray();
        for(char ch : arr){
            System.out.print(ch);
        }System.out.println();
*/

    }
}