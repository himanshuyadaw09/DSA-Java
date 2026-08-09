public class Power {
    // static int power(int a, int b){
    //     if(b==0) return 1;
    //     return a*power(a,b-1);
    // }

    // Logarithmic Time Complexity
    static int power(int a, int b){
        if(b==0) return 1;
        int call = power(a,b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
    public static void main(String[] args){
        System.out.print(power(5,3));

    }
    
}
