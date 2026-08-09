public class CountVowel {
    public static void main(String[] args){
        String str = "Hey my name is Himanshu Yadav , I am from siwan bihar!";
        // String str2 = str.toLowerCase();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count ++;
        }
        System.out.println("Number of Vowels: " + count);
    }
    
}
