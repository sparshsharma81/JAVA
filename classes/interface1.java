 interface ABC{
        // ABC(int a){
        //     this.a =a;
        // }
        //interface can not have constructors....
    }

    class A implements ABC{
       public void print(){
            System.out.println("The class is working");
            
        }
    }public class interface1 {
   
    public static void main(String args[]){

    A ABC = new A();
    ABC.print();
    }
 
}


/*
 in interface -- we can not make object
 --we can not make constructor
 by default all data members are constant



 access modifier can not have lower scope

 public --- public
 protected --- public/ protected
 protected --- private 





 DIFFERENCE BETWEEN CLASSES AND interface 
 class
 objects can be created(except abstract class)
 --it can have constructor
 --data member are made constantly explicitly
 (using final keywoard);
 default scope is package-private
 no multiple inheritance


 objects can't be created
 can't have constructor
 data members are constant implicitly
 default scope of members and methods is public
 multiple inheritance
 */
