class PEN{
    String name;
    String color;
    String type;
    public void print(){
        System.out.println(this.color + this.type +  this.name);
    }
    PEN(String color, String type, String name){
        this.name = name;
        this.type = type;
        this.color = color;


    }

}
public class constructors {
    public static void main(String[] args) {
        PEN pen = new PEN("blue","ball","gellet");
        pen.print();

        
    }
}
