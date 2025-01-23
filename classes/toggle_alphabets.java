import java.util.*;
public class toggle_alphabets {
    public static void main(String[] args) {
        stringbuilder s1 = new stringbuilder();
       for(int i=0;i<s1.length();i++){
        char ch = s1.charAt(i);
        if(Character.isLowerCase(ch)){
            s1.setCharAt(i,Character.toLowerCase(i));

        }
        
       }
       System.out.print(s1);
    }
}
