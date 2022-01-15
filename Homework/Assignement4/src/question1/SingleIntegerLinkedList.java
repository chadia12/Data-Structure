package question1;

public class SingleIntegerLinkedList<Integer>{
    private Node head = null;
    private int size =0;
  private static class Node<Integer> {
      private int data;
      private Node next;
      private Node(int item){
          this.data = item;
          this.next = null;
      }
      private Node(int item, Node<Integer> ref){
          this.data = item;
          this.next = ref;
      }
  }
  private void addFirst(int item){
      Node <Integer> temp = new Node<>(item,head);
      head = temp;
      size++;
  }
  private void addAfter(int item, Node<Integer> node){
      Node<Integer> temp = new Node<>(item,node.next);
      node.next = temp;
      size++;
  }


  private Node<Integer> getNode(int index){
    Node<Integer> node= head;
      for (int i = 0; i < index && node != null; i++) {
          node= node.next;

      }
      return  node;
  }
  public void add(int index, int item){
if(index < 0 || index >size)
    throw new ArrayIndexOutOfBoundsException();
if(index == 0) {
    addFirst(item);
}
else{
    Node <Integer> node = getNode(index-1);
    addAfter(item,node);
}
  }
  public void add(int item){
      add(size,item);
  }
  public int size(){
      return size;
  }
  public boolean find(int item){
      Node<Integer> current =head;
      while (current!=null){
if(current.equals(item))
    System.out.println("item is found");
          current = current.next;
      }
      return true;
  }
  public void display(){
      Node<Integer> current = head;
      while(current!= null){
          System.out.println(current.data);
          current = current.next;
      }
  }

public int max(){
      int maxnum =0;
      Node<Integer> current = head;
      while (current!=null){
          if(current.data > maxnum)
              maxnum =current.data;
          current =current.next;
      }
      return maxnum;
}
public int min(){
      int minnum = head.next.data;
      Node<Integer> current= head;
      while(current!=null){
        if(current.data < minnum)
            minnum =current.data;
          current =current.next;
      }
      return minnum;
}

    }