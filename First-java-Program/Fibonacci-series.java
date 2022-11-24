import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		int number1 = 0 , number2 = 0 , number3 = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter Series length:");
		
        int n = in.nextInt();
        
        System.out.print("Please enter Num:");
        
		number1 = in.nextInt();
		
        System.out.println("Fibonacci series:");
        
		for (int i = 0; i<n ; i++){
		    number3 = number2 + number1;
		    System.out.println(number3);
		    number1 = number2;
		    number2 = number3;
		}
	}
}