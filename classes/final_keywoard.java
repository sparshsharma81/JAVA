public class final_keywoard {
    public static void main(String[] args){
        //final keywoard is used to disallow modifcations on variables / objects / references variables/classes 
        //access modifiers whilte overloading can't have lesser scope 

        //in java ----default is package private---
        //means they are accessible within the package not outside the package

        /*
         protected functions are those which are inherited by their child
         and if its child inherit it..then it can be accessed outside the package


         so the biggest scope is public, then protected and then default and then private
         public > protected > default > private 



         in coding we use final when we do not want to change the value 
         like constant 

         final int a = 10;
         then the value of a can not be changed
          
         if we write a = 20;
         then it will give error 



         final Mutable m1 = new Mutable();
         m1.x = 10;
         m1.x = 20; --the 20 can be changed
         m1 = new Mutable(); --- this will show error 
         */

    }
}
