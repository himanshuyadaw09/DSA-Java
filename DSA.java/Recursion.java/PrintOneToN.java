public class PrintOneToN {
    // static void printNumber(int x, int n){
    //     if(x>n) return;
    //     System.out.printf(x + " ");
    //     printNumber(x+1,n);
    // }
// Method 2
    static void printNumber(int n){
        if(n==0) return;  // Base case
        printNumber(n-1);  // Work
        System.out.printf(n + " ");  // call
        
    }

    public static void main(String[] args){
        printNumber(10);
    }
}
