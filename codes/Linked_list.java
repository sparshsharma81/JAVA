public class Linked_list {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    static int length(Node a){
        int count =0;
        while(a!=null){
            count++;
            a= a.next;
        }
        return count;
    }
    static void display(Node head){
        if(head==null) return;
        display(head.next);
        System.out.print(head.data+" ");
        
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
        
        if(head==null){
            head = temp;
        }
        else{
            tail.next = temp;
        }
        tail = temp;
    }
    void display(){
        while(head!=null){
            System.out.println(head.data+" ");
            head = head.next;

        }
    }
}
    public static void main(String args[]){
        /*
         basically the linked list -
         linked list are the list basically
         array has fixed size and continous memory
         if we make big memory then it has a limitation and for too big it is sometimes not able to find
         in array the addres is continous.like first element has address 5000 then next is 5001

         innsertion in array is difficult as we need to shift each element making time complexicity worse


         introduction to linked list----

         if we have first member of the linked list..we can access all elements
         first member -- head
         last member--- tail
         */


        //  Node x = new Node();
        //  System.out.println(x.data);
        //  System.out.println(x.next);
        //  System.out.println(x);

        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(1);
        Node e = new Node(11);
         a.next = b;
         b.next = c;
         c.next = d;
         d.next =e;
         e.next = null;

        //  System.out.println(d.next.data);
        //  System.out.println(d.next);
        //  System.out.print(d.data);
                //DISPLAYING THE LINKED LIST---
                Node temp = a;
                // for(int i=0;i<=4;i++){
                //     System.out.println(temp.data);
                //     temp = temp.next;
                // }
                // while(temp!=null){ //print with only head
                //     System.out.print(temp.data + " ");
                //     temp = temp.next;
                // }
                // display(a);


                //now creating a function to find the length of the string
                int len = length(a);
                System.out.println(len);
                linkedlist l1 = new linkedlist();
                l1.insertAtEnd(2);
               
    }
}
