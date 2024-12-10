import java.util.*; //this includes import java.util.random
public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Great now welcome to the game of rock,paper and scissors....");
        System.out.print("So now enter the number please: 1-rock , 2-paper, 3- scissor: ");
        Random rand = new Random();
        int user_choice = sc.nextInt();
        int random_choice = rand.nextInt(3);
        if(user_choice<=0 || user_choice>3){
            System.out.println("Bhai ye to invalid hai");
        }
        else{
            if(user_choice == random_choice){
                System.out.println("Bhai kamal ki baat hai.. ye to tie ho gya");
            }
            else {
                if(user_choice > random_choice || (user_choice == 3 && random_choice == 1)){
                    System.out.println("Congs bhai tu jeet gya");
                }
                else{
                    System.out.println("Bhai...once more...");
                // }public static void question5(int n) {
                //     int[] arr = new int[n];
                //     for (int i = 0; i < n; i++) {
                //     arr[i] = i * i;
                //     }
                //     System.out.println(arr);
                //     }
                    }
                
            }

        }
        


        
    }
}




/*
 * 
 * 
 * import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User is giving the input.
        System.out.println("It's Your turn, \nPlease choose your choice : ");
        Random rand = new Random();
        int i = 1;
        while(i <= 4){
            int Your_Turn,Computer_Turn;
            Your_Turn = sc.nextInt(3);
            //Computer is giving the input.
            Computer_Turn = rand.nextInt(3);
        
        System.out.println("You choosed : ");
        switch(Your_Turn) {
            case 0:
            System.out.println("Rock");
            break;
            case 1:
            System.out.println("Paper");
            break;
            case 2:
            System.out.println("Scissor");
            break;
        }
        System.out.println("Computer choosed : ");
        if(Computer_Turn == 0) {
            System.out.println("Rock");
        } else if(Computer_Turn == 1){
            System.out.println("Paper");
        } else if(Computer_Turn == 2){
            System.out.println("Scissor");
        }

    System.out.println("Here is the winner : ");
    if(Your_Turn == 0 && Computer_Turn == 1) {
            System.out.println("Oops! The computer won. Better luck next time");
    } else if(Your_Turn == 1 && Computer_Turn == 2) {
        System.out.println("Oops! The computer won. Better luck next time");
    } else if(Your_Turn == 2 && Computer_Turn == 0) {
            System.out.println("Oops! The computer won. Better luck next time");
    } else if(Your_Turn == 1 && Computer_Turn == 0) {
            System.out.println("Congragulations! You won!");
    } else if(Your_Turn == 2 && Computer_Turn == 1) {
        System.out.println("Congragulations! You won!");
    } else if(Your_Turn == 0 && Computer_Turn == 2) {
        System.out.println("Congragulations! You won!");
    } else if(Your_Turn == 0 && Computer_Turn == 0 || Your_Turn == 1 && Computer_Turn == 1 || Your_Turn == 2 && Computer_Turn == 2) {
        System.out.println("Sorry, the match is drawn. Please play again.");
    }
    i++;
}
}
}
 */