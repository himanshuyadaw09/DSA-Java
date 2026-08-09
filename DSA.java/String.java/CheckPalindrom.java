public class CheckPalindrom {
    static boolean palindrom(String str2){
        String str = str2.toLowerCase();
        int i = 0, j = str.length()-1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        String str = "Markram";
        System.out.println("are given String Palindrom: " + palindrom(str));


    }
    
}
