class PEN{
    String name;
    int age;
    String type;

    public void print(int a){
        System.out.println("Great...you have entered a integer");
    }
    public void print(int a, int b){
        System.out.println("Great...you have entered two intergerse...");

    }
    public void print(double a){
        System.out.print("Great..you have entered a double");
    }
    PEN(){
        System.out.print("This is a default constructor");
    }
}
public class compile_time_polymorphism {
    public static void main(String[] args) {
        PEN pen = new PEN();
        pen.name = "gelet";
        pen.type = "gel";
        pen.age = 1;
        double a = 3;
        pen.print(a);
    }
}
