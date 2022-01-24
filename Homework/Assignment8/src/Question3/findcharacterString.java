package Question3;

public class findcharacterString {
        public static void main(String[] args) {
            System.out.println(numOfChar("chadia"));

        }
        public static int numOfChar(String s){
            if(s.isEmpty())
                return 0;
            else
                return 1+ numOfChar(s.substring(1));

        }

}
