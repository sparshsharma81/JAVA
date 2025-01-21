import java.util.*;
public class linked_list2 {
    // class Node{
    //     String data;
    //     Node next;
    // }
    // Node(String data){
    //     this.data = data;
    //     this.next = null;
    // }
  public static void main(String args[]){
    //linked list
    LinkedList<String>list = new LinkedList<>();
    list.add("Apple");
    list.add("Banana");
    list.addFirst("Orange");
    System.out.print(list);
    System.out.print(list.get(1));
    System.out.print(list);

  } 
}
