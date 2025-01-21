

public class doublelinked_list{
    static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
            this.prev = null;
            this.next = null;


        }
        
        }
        static Node head;
        static Node tail;
        static void display(Node head){
            Node temp = head;
            while(temp!=null){
                
                      System.out.print("Previous is: " + (temp.prev!=null?temp.prev.val:"Null") + "\t And present is: "+ (temp!=null?temp.val:"Null") + "\t And forward is:" + (temp.next!=null?temp.next.val:"Null")+"\n");
                      temp = temp.next;
                
                
              
                
            }
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void insertionAtHead(int val){
        Node temp = new Node(val);
        if(head ==null){
            head = tail = temp;
            return;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
    
    }

    //insertion at tail in doubly linked list
    public static void insertionAtTail(int val){
        Node temp = new Node(val);
        if(head==null){
            //this means that the node is empty
            head = temp = tail;

        }
        
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }
    public static void insertAtIndex(Node head , int idx, int x){
       Node temp = head;
       for(int i=0;i<idx;i++){
        temp = temp.next;
       }
       Node r = temp.next;
       Node t= new Node(x);
       temp.next = t;
       temp.next.prev = t;
       t.prev = temp;
       t.next = r;


    }

    public static void DeleteHead(){
        head = head.next;
        head.prev = null;

    }
    public static void DeleteTail(){
        tail = tail.prev;
        tail.next = null;
    }
    public static void Deleteindex(Node head, int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;

        }
        temp.next = temp.next.next;
        temp.next.prev = temp.next;
    }



    public static void main(String args[]){
        // System.out.print("Hello world");
        //in doubly linked list each node is pointing forward as well as backword
        Node a = new Node(3);
        Node b = new Node(23);
        Node c = new Node(2);
        Node d= new Node(1);
        Node e = new Node(0);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        head = a;
        tail = e;
        display(head);

        System.out.println("New ..");
        insertionAtHead(21);

        insertionAtTail(323);
        displayrev(tail);
        insertAtIndex(head, 2, 2912);
        DeleteHead();
        DeleteTail();
        Deleteindex(head, 3);

        display(head);
        

        

        
        // System.out.print(a.val);

    }
}