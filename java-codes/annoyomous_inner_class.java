class A{
    public void show(){
        System.out.println("This is class A");


    }
    class b{
        public void show(){
            System.out.println("This is class B");
        }


    }
}
public class annoyomous_inner_class {
    public static void main(String[] args) {
        A obj = new b();
        obj.show();
    }
}
