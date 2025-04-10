import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class q2{
    public static void main(String args[]){
        String str= "System.out.println(\"Hello\")     //prints Hello";
        String rex = "//.*";
        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(str);
        

    }
}