public class NthStair {
    static int stair(int n){
        if(n==1 || n==2) return n;
        return stair(n-1) + stair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(stair(6));
    }
    
}
