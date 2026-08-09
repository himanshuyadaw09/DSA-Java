public class GCD2Number {
    static int gcd(int a, int b){
        int hcf = 1;
        for(int i = 2; i <= Math.min(a,b); i++){
            if(a%i == 0 && b%i == 0) hcf = i;
        }
        return hcf;
    }
    // hcf(a,b) = hcf(b%a,a); Time Comp = O(log(min(a,b)));
    static int gcdFind(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args){
        int a = 12, b = 16;
        System.out.println(gcd(a,b));
        System.out.println(gcdFind(a,b));
    }
    
}
