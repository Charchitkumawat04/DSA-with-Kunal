 import java.util.Scanner;

 public class interest {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.print("P: ");   //input Principal
         int P = input.nextInt();
         
         System.out.print("I: ");   //Input interest
         int I = input.nextInt();
         
         System.out.print("T: ");   //Input TIme
         int T = input.nextInt();
         
         int SI = P*I*T/100;
         
         System.out.println(SI + " is the Simple Interest");
     }
 }