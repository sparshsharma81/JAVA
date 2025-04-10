import java.util.regrex.Matcher;
import java.util.regrex.Pattern;
public class regrex_question{
    public static void main(String args[]){
        String str ="Today's date is 10-04-2025";
        String rex = "\\d{2}-\\d{2}-\\d{4}";
        Pattern p = Pattern.compile(Rex);
        Matcher m = p.matcher(str);
        if(m.find()){
            System.out.println(m.group);
            
        }

    }
}