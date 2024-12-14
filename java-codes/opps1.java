class PEN{
    String color;
    String type;
    public void write(){
        System.out.println("This is the pen functioun "+this.color+" "+this.type);
    }
}


public class opps1 {
    public static void main(String[] args) {
        PEN pen = new PEN();
        pen.color = "Blue";
        pen.type = "Gel";
        pen.write();
        
    }
}
