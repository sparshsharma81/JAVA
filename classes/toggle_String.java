// package classes;
import java.util.*;
public class toggle_String {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String st= sc.next();
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(Character.isAlphabetic(ch)){
                    if(Character.isLowerCase(ch)){
             ch = Character.toUpperCase(ch);
            }
            else if(Character.isUpperCase(ch)){
               ch =  Character.toLowerCase(ch);
            }
            st.setCharAt(i,ch);
            }
            
        
           
        }
        System.out.print(st);

    }
}
