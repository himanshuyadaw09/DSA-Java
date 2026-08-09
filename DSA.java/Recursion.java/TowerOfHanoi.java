public class TowerOfHanoi {
    static void hanoi(int n, char a, char b, char c){
        if(n==0) return;
        hanoi(n-1,a,c,b); // n-1 disks form A to B via C
        System.out.println(a+"->"+c); // largest form A to C
        hanoi(n-1,b,a,c); // n-1 disks form B to C via A
    }
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
    
}
