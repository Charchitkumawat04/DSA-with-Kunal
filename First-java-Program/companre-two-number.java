 import java.util.Scanner;

 public class compare {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.print("Num 1:");
         int num1 = input.nextInt();
         System.out.print("Num 2:");
         int num2 = input.nextInt();
         
         //comparision
         if(num1>num2){
            System.out.print("Num 1 is greater");
         }
         else if (num2>num1){
            System.out.print("Num 2 is greater");
         }
         else {
            System.out.print("Both are Equal");
         }
     }
 }             System.out.print("Num 1 is greater");
