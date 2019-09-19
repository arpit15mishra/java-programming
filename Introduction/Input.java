import java.util.Scanner;
public class Input{

    public static void main(String[] args) {
    	                        System.out.println("Program to take input");
                                Scanner myObj = new Scanner(System.in);  
                                System.out.println("Enter number");

                                int num = myObj.nextInt(); 
                                if(num>=0)
                                { 
                                System.out.println("Number is Positive");  
                                }
                                else
                                {
                                System.out.println("Number is negative");
                                }
                            }
                        }