import java.util.Scanner;

public class getuserinput {
    public static void main(String[] args) {
        System.out.println("Enter the numbert: ");
        //in order to read data from the user,, java has a scanner class;;;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one:");;
        int a = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int b = sc.nextInt();
        System.out.print("The sum of these two numbers is : ");
        System.out.println(a+b);
        float a1 = sc.nextFloat();
        System.out.println("You have entered : ");
        System.out.println(a1);
        //now taking input as strinng'
        System.out.print("Now enter the value for string: ");
        String s = sc.next(); //this will read the word

        System.out.println("Bhai tune likha hai" +s);
        sc.nextLine();
        
        System.out.println("Now enter the value for other string");
        String s2 = sc.nextLine();
        System.out.print(s2);
        sc.close();
    }
    //int a = sc.nextInt();
    //float b = sc.nextFloat();

    
}
