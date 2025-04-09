import java.util.*;
import java.util.regex.Pattern;
public class regrex {
    public static void main(String args[]){
        //regrex is used when we want to find patterns
        /*
         [xyz] ---- x or y or z;
         [^xyz] --- any character other than x, y,z
         */

         System.out.println(Pattern.matches("[abc]",["b"]));
         
    }
}
