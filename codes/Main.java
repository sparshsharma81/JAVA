import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int input = scanner.nextInt();
        int temp = input;
        int sumDigits = 0;
        while(temp>10){
            sumDigits = 0;
            while(temp!=0){
                sumDigits+= temp % 10;
                temp /= 10;
            }
            temp = sumDigits;
        }
        int sumPrime = 0;
        // prime factors
        while(input % 2 == 0){
            sumPrime += 2;
            input /= 2;
        }
        for(int i=3 ;i<=Math.sqrt(input);i++){
            while(input % i ==0){
                sumPrime += i;
                input /= i;
            }
        }
        if(input>2){
            sumPrime += input;
        }
        int sumPrimeDigits = 0;
        while(sumPrime>10){
            sumPrimeDigits = 0;
            while(sumPrime != 0){
                sumPrimeDigits += sumPrime % 10;
                sumPrime /= 10;
            }
            sumPrime = sumPrimeDigits;
        }
        if(sumDigits == sumPrimeDigits){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}