import java.util.Scanner;

public class max_sub_array_sum {
    public static void main(String args[]) {

		Scanner sc= new Scanner(System.in);
		int a1= sc.nextInt();
		sc.nextLine();

		// sc.nextLine();

		for(int i1=0;i1<a1;i1++){

		
		int a = sc.nextInt();

		int[] arr= new int[a];

		int totalSum =0;
		for(int i=0;i<a;i++){
			arr[i] = sc.nextInt();
			totalSum+=arr[i];
			
		}

		//the maximum circular sum = totalSum - minSum

//now we are finding the minSum
int currentSum = arr[0] , minSum = arr[0];
for(int i=1;i<arr.length;i++){
	currentSum = Math.min(arr[i],currentSum + arr[i]);
	minSum = Math.min(minSum,currentSum);
}
   if (minSum == totalSum) {
            System.out.println("0");  
        } else {
            System.out.println(totalSum - minSum);  
        }
    }
    }
}
