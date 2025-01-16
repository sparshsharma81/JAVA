import java.util.*;
public class toggle_character {
    public static void main(String[] args) {
        //we are given a string and we need to toggle all the characters of the string..
        //i.e- convert lowercase to uppercase and uppercase to lowercase
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        str.append(sc.nextLine());
        //great... now we have taken the input..
        for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           int ascii = (int)ch;
           if(ch==' ') continue; //iska matlab loop se aage chalejayege
            if(ascii>65 && ascii<89){
            ascii+=32;
            char cap = (char)ascii;
            str.setCharAt(i, cap);
           }
           else if(ascii>97 && ascii <123){
            ascii-=32;
            char chr = (char)ascii;
            str.setCharAt(i, chr);
           }
           else{

           }
          
        }
         System.out.println(str);
        sc.close();


    }
}
