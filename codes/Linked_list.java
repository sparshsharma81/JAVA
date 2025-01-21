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
    void insertAtBeginning(int val){
        Node temp = new Node(val);
        if(head==null){
            //iska matlab hai ki list empty hai
            head = temp;
            tail = temp;
        }
        else{
            //iska matlab non empty linked list hai
            temp.next = head;
            head = temp;
        }

    }
    void insertAt(int idx, int val){
        Node p = new Node(val);
        Node temp = head;
        for(int i=1;i<idx;i++){
            temp = temp.next;
            //this loop signify ki hame jis index pr element insert karna hai..
            //hame uss index se ek pehle leke jaana hai so that ham required index pr element insert kar sake;

        }
        p.next = temp.next; 
//now this code means that jab ham apni required position tk puch gye..then yani ki jo element hame insert karna hai..
//uss element ko temp.next ke saat join kardo...

        temp.next = p;
        //then hame jo element insert karna hai...hm use join kar dege inserted element ke saath;;;
    } //this code is valid till all the index between head and tail but at the last index...
    //it will add the elements..but the tail pointer will not point towards them

    int getAt(int idx){
        Node temp = head;
        for(int i =1;i<=idx;i++){
            temp = temp.next;

        } 
        return temp.data;


    }
    
    void deleteAt(int idx){
        if(head == null) return; //iska matlab ki linked list empty hai
        if(idx==0){
            //iska matlba first element ko delete karna hai yani ki head ko first element set karna hoga--
            head = head.next;
            if(head == null){
                tail = null;

            }
            return;
        }
        Node temp = head;
        for(int i =1;i<idx;i++){
            temp = temp.next;


        }
        if(temp.next!=null && temp.next.next == null){
            tail = temp;
        }
        temp.next = temp.next.next;
        

    }
    void display() {
        Node temp = head;  // Use temp to traverse instead of modifying head
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();  // To move to the next line after printing
    }
    // public static class linked_listt{
    //     Node head = null;
    //     Node tail  = null;

    //     void insertAtBeginning(){
    //         Node temp2 = new Node(int val2);
    //         if(head==null){
    //             head = temp;
    //         }
    //         else{
                
    //         }
    //     }

    // }
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
                l1.display();
                l1.insertAtEnd(9);
                l1.display();
                l1.insertAtBeginning(0);
                l1.insertAtBeginning(21);
                l1.insertAtBeginning(2323);
                l1.insertAt(2, 222);
                
                l1.display();
                int a1 = l1.getAt(3);
                System.out.println(a1);

                l1.deleteAt(3);
                l1.display();
                System.out.println(l1.tail.data);
                l1.deleteAt(2);
                l1.deleteAt(1);
                l1.display();
               
    }
}
