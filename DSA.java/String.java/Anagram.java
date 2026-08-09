// import java.util.Collections;
import java.util.Arrays;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i = 0; i < ch1.length; i++){
            if(ch1[i] != ch2[i]) return false;
        }
        return true;        
    }
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(areAnagrams(s1,s2));
    }
}