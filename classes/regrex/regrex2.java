public class regrex2{
    public static void main(String args[]){
        String str = "Today's date is 10th April 2025";
        String rex = "\\d{4}";

        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(str);
        if(m.find()){
            System.out.println(m.group);

        }



        if(m.find()){
            System.out.println(m.group()); //this will find the index;
            System.out.println("Start": + m.start() + " || end" + m.end());
        //we will find the start and end index


        }
        while(m.find()){
            System.out.println(m.group()); //this will find the index;
            System.out.println("Start": + m.start() + " || end" + m.end());
        //we will find the start and end index

        
        }


        // if the pattern finded..if we need to replace themm
        String replaced = m.replaceAll('####');
        String replacedFirst = m.replaceFirst('####');
        
    }
}