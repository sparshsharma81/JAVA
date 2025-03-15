// package classes.Collection_interface.Hashmap;
import java.util.*;

public class valid_anagram {
    public static HashMap<Character,Integer> makeFrequency(String s){
        HashMap<Character,Integer>h1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            
            if(!h1.containsKey(s.charAt(i))){
                h1.put(s.charAt(i),1); //if the value exist then make it 1
            }
            else{
                h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
            }

           
        } 
        return h1;
    }
    public static void main(String args[]){
        //one string is valid anagram of another if 
        /*
         they both have same number of characters.
         their length must be same

         */
    
        String s1 = "listen";
        String s2 = "silent";
        if(s1.length()!= s2.length())System.out.print("No");

        HashMap<Character,Integer>h1 = makeFrequency(s2);
        HashMap<Character,Integer>h2 = makeFrequency(s1);

        System.out.print(h1.equals(h2));
    }
    
}
