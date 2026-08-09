public class FibonacciNumber {
    static void printFibonacci(int n){
        int a = 0, b = 1;
        for(int i = 0; i < n; i++){
            System.out.print(a+ " ");
            int next = a+b;
            a = b;
            b = next;
        }
    }

    // Time comp = O(pow(2,n))  A.S= O(n)
    static int nthFibonacci(int n){
        if(n==0 || n==1) return n;
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
    public static void main(String[] args){
        printFibonacci(10);
        System.out.println();
        System.out.println("10th Fibonacci : " + nthFibonacci(10));

    }
    
}
