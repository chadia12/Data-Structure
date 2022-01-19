package Question1;

public class TestSymbols {
    public static void main(String[] args) {
        System.out.println(balancedSymbols("{(2+3)]"));

        System.out.println(balancedSymbols("[{(2+3)}]"));

        System.out.println(balancedSymbols("[)(2+3}]"));
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