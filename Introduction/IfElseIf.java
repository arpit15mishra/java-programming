
 import java.util.Scanner;
 public class  IfElseIf{

     public static void main(String[] args) {
             System.out.println("Program for IfElseI 
              Scanner myObj = new Scanner(System.in);  
             System.out.println("Enter number");
             int num = myObj.nextInt();                           
             if(num>90)
             { 
             System.out.println("You are genious");  
             }
             else if(num>=40&&num<=90)
             { 
             System.out.println("You did it");  
             }
             else
             {
             System.out.println("Better luck next time");
             }
         }
     }