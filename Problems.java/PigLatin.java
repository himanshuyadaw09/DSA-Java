import java.util.Scanner;
public class PigLatin {

    // Check if a character is a vowel
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    // Convert a single word to Pig Latin
    public static String toPigLatin(String word){
        if( word == null || word.isEmpty())
            return word;
        // ── Case 1: Starts with a vowel ──────────────────────────
        if( isVowel(word.charAt(0))){
            return word + "way" ;
        }
        // ── Case 2: Starts with one or more consonants ───────────
        int firstVowelIndex = -1;
        for(int i = 0 ; i < word.length(); i++){
            if(isVowel(word.charAt(i))){
                firstVowelIndex = i;
                break;
            }
        }
        // Case 3: No vowel found → just add "ay"
        if( firstVowelIndex == -1 ){
            return word + "ay";
        }
        // Move all leading consonants to end, add "ay"
        String consonantCluster = word.substring(0,firstVowelIndex);
        String restOfWord = word.substring(firstVowelIndex);
        return restOfWord + consonantCluster + "ay";

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter English Word: ");
        String word = sc.next();
        String result = toPigLatin(word);
        System.out.println(word + " = " + result);

    }
}