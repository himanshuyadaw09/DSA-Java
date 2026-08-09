public class CompareTo {
    static int compareTo(String a, String b){
        int i = 0, j = 0, result = 0;
        while(i < a.length() && j < b.length()){
            if(a.charAt(i) == b.charAt(j)) result = 0;
            else if(a.charAt(i) != b.charAt(j)){
                int ch1 = (int) a.charAt(i), ch2 = (int) b.charAt(j);
                return ch1-ch2;
            }
            i++;
            j++;
        }
        int count = 0;
        if(a.length() > b.length()){
            for(int k = i; k < a.length(); k++){
                count ++;
            }
            return count;
        }else if(a.length() < b.length()){
            for(int k = j; k < b.length(); k++) count ++;
            return (-1)*count;
        }
        return result;
    }
    public static void main(String[] args){
        String str1 = "";
        String str2 = "";
        System.out.println(compareTo(str2,str1));
        System.out.println(str2.compareTo(str1));

    }
}