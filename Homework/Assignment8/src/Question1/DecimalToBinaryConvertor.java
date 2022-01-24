package Question1;

public class DecimalToBinaryConvertor {
    public static void main(String[] args) {
        System.out.println(convertor(100));
    }

    public static int convertor(int decimal){
        if (decimal == 0){
            return 0;
        }else {
            return decimal % 2 +10 * (convertor(decimal/2));
        }
    }
}
