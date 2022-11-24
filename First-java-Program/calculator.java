 import java.util.Scanner;

 public class calculator {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         
         
         System.out.print("Enter num1:");
         int a = input.nextInt();
         
         System.out.print("Enter num2:");
         int b = input.nextInt();
         
         System.out.print("Enter Operation u want to perform:");
         
         char op = input.next().charAt(0);
        //  String plus = "+";
        //  String minus = "-";
        //  String divide = "/";
        //  String multiply = "*";
         
        if (op == '+'){
         System.out.print("SUM:" + (a+b));
        }
        else if (op == '-'){
         System.out.print("Minus:" + (a-b));
        }
        else if (op == '/'){
        System.out.print("Divide:" + (a/b));
        }
        else if (op == '*'){
            System.out.print("Multiply:" + (a*b));
        }
        else {
            System.out.print("Gand mara BSDK:");
        }
     }
 }