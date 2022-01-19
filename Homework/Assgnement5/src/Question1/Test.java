package Question1;

public class Test {
    public static void main(String[] args) {
        KWLinkedList <String> list = new KWLinkedList<>();
        list.add("chadia");
        list.add("Ivannia");
        list.add("Towdah");
        list.add("Tehillah");
        list.add("chadia");

        System.out.println(list);
list.removeAllOf("chadia");
        System.out.println(list);
    }
}
