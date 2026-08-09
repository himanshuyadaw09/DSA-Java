import java.util.Arrays;

public class MostFrequentChar {
    // M - 1: Brute Force
    static char freqChar(String s){
        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        for(int i = 0; i < n; i++){
            int freq = 1;
            for(int j = i+1; j < n; j++){
                if(s.charAt(j) == s.charAt(i)) freq++;
            }
            if(freq > maxFreq){
                maxFreq = freq;
                ans = s.charAt(i);
            }
            else if(freq==maxFreq && ans>s.charAt(i)) ans = s.charAt(i);
        }
        return ans;
    }

    // M - 2: Sorting & sliding window
    static char mostFreqChar(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);       
        int maxFreq = -1, i = 0, j = 0;
        char ans = ch[0];
        while(j<ch.length){
            if(ch[i] == ch[j]) j++;
            else{
                int freq = j-i;
                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = ch[i];
                }
                i = j;
            }
        }
        // incase of last char is most frequent
        int freq = j-i;
                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = ch[i];
                }
        return ans;
        
    }

    // M - 3 : Frequency Array
    static char mostFreq(String s){
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int idx = ch-97; // ascii value of starting alphabet 'a' is 97
            freq[idx]++;
        }
        int maxFreq = 0;
        char ans = s.charAt(0);
        for(int i = 0; i < 26; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                ans = (char)(i+97);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String s = "characterrzzzzz";
        System.out.println(freqChar(s));
        System.out.println(mostFreqChar(s));
        System.out.println(mostFreq(s));
    }
    
}
