abstract class Car{
    public abstract void drive();
    public void print(){
        System.out.println("This is printing");
    }



}
class drive extends Car{
    public void drive(){
        System.out.println("This is drivind the car...");

    }
}
public class abstraction {
    //in java..there are two types of abstraction....
    // class abstraction
    // inheritance --- this will achieve 100% of abstraction...
    public static void main(String[] args) {
        Car obj = new drive();
        obj.drive();
        obj.print();
        
    }
}
