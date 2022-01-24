package Question2;

import java.util.Locale;

public class VowelCounterString {
    public static void main(String[] args) {
        System.out.println(vowelcounter("chadia"));

    }
    public static int vowelcounter(String s){
        int count =0;
        char ch ;
        s = s.toLowerCase();
        if (s.length() < 1 ) return 0;
        else
            ch = s.charAt(0);
        if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'u' || ch == 'o'){
            count++;
        }

        return count + vowelcounter(s.substring(1));
    }
}
