package question1;

public class TestMain {
    public static void main(String[] args) {
SingleIntegerLinkedList<Integer> slist = new SingleIntegerLinkedList<>();
        slist.add(100);
        slist.add(70);
        slist.add(67);
        slist.add(900);
        slist.add(9);
        slist.add(45);
        slist.display();
        System.out.println("The maximum integer is: "+slist.max());
        System.out.println("The minimum integer is: "+slist.min());
    }
}
