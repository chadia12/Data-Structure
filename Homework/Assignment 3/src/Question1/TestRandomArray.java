package Question1;

import java.util.Arrays;

public class TestRandomArray {
    public static void main(String[] args) {
        RandomArray num= new RandomArray();
        num.insert();
        num.removeDuplicates();
        System.out.println("Size: " +num.size());
        num.set(0,70);
        System.out.println(num.get(0));
        System.out.println(Arrays.toString(num.subList(2,5)));
        num.clear();



    }
}
