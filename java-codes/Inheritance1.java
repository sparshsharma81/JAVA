
class Shape{
    int edge;

}
class Triangle extends Shape{
    Triangle(int edge){
        
        System.out.println("the perimeter is: "+ edge *3);

    }
}
public class Inheritance1{
    public static void main(String args[]){
        Triangle t1 = new Triangle(23);
       


    }
}