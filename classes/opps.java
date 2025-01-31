public class opps {

    class engineer extends employee{
        int bonus;
        enginner(){
            System.out.println("Enginner");
        }
    }
    
    public static void main(String[] args) {
        engineer e1 = new enginner();
        e1.name = "Jai";
        employee emp1 = new employee();
        System.out.println(e1 instanceof engineer);
        System.out.println(e1 instanceof employee);
        System.out.print(emp1 instanceof enginner);
        System.out.print(emp1 instanceof employee);
    }
}
