  class Immutable{
        int a;
        int b;
        int c;
        
    }
    class Mutable{
        int x;

    }
    public class immutable_class {
  
    public static void main(String[] args) {
        //we use final keywoards when we do not want to allow modifications in a particular data types

        Immutable im = new Immutable();
        im.a =10;
        im.b = 20;
        im.c = 30;

    }
    //if we want to make immutable class ---
    /*
     final private int a;
     final private int b;



     we are making a class whose objects are not changed....

     class Immutable{
     final private int a;
     final private int b;

     final Mutable m;

     Immutable(int a, int b , Mutable m){
     this.a = a;
     this.b = b;

     this.m = m ---- this is shallow copy



     these are deep copy
     this.m = new Mutable();
     this.m.x = m.x;
     
     
     //}
     }


     Mutable get_m(){
     //this is konwn as defensive copy which is used when we want to return;
     Mutable temp = new Mutable();
     temp.x = this.m.x;
     return temp;

     }


     Immutable(int a, int b, Mutable m){
     this.a = a;
     this.b = b;
     }



     *****RULES*****
     DATA MEMEBERS MUST BE PRIVATE AND FINAL
     CLASS SHOULD BE FINAL TO AVOID INHERITANCE
     IN CASE OF AN OBJECT REFERENCE VARIABLE,
     use deep copy to initilize object
     use defensive copy while returning object...
     
     */
}
