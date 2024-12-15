interface A{
    int age = 23;
    String area = "Mumbai"; //all the variables in interface are final and static....
    void show();
    void config();

}
class b implements A{
    public void show(){
        System.out.println("This is show function");
    }
    public void config(){
        System.out.println("This is config function....");
    }
}

public class interface1 {
    public static void main(String[] args) {
        
    }
}
