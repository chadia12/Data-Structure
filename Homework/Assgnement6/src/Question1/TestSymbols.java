package Question1;

import java.util.Scanner;

public class TestSymbols {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter arithmetic operation");
        String str =input.next();

        System.out.println(balancedSymbols(str));
    }

    public static boolean balancedSymbols(String sy) {
        Symbols<Character> str = new Symbols<>();
        for (int i = 0; i < sy.length(); i++) {
            char s = sy.charAt(i);
            if (s == '[' || s == '(' || s == '{') {
                str.push(s);
            }
            else if (s == ']') {
                if ( str.empty() || str.pop() != '[' ) {
                    return false;
                }
            } else if (s == ')') {
                if (str.empty() || str.pop() != '(' ) {
                    return false;
                }
            } else if (s == '}') {
                if (  str.empty() || str.pop() != '{' ) {
                    return false;
                }
            }

        }
        if(str.empty())
        return false;

        return true;
    }

}