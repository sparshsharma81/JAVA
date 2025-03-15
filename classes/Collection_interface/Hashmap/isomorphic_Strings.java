// package classes.Collection_interface.Hashmap;

import java.util.*;
public class isomorphic_Strings {
    public static void main(String args[]){
        //now we are checking that strings are isomorphic or not 
        //basically it means that if the character is s are replaced to get t ---then we get the same string back
        // s = a b c d c a
        // t = x y w s w x 
        //both of these string are isomorphic/.

        String s = "abcdck";
        String t = "xywswx";
        HashMap<Character,Character>h1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character sch = s.charAt(i);
            Character tch = s.charAt(i);
            if(h1.containsKey(sch)){
                if(h1.get(sch) != tch) System.out.println("False");
            }
            else if(h1.containsValue(tch)) System.out.print("False");
            else{
                h1.put(sch,tch);
            }

        }
        System.out.print("True");
        


    }
    
}
