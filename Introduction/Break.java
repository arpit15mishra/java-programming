import java.util.Scanner;
public class Break{
                    public static void main(String[] args) {
                    	System.out.println("Program for Break");
                      Scanner myObj = new Scanner(System.in);  
                      System.out.println("Enter number"); 
                      int i = myObj.nextInt(); 
                      while (i >0) {
									System.out.println(i-1);
									  --i;
									  if (i == 0) {
									  	System.out.println("You reached 0");
									    break;
									    
									  }
									} 
								}
							}
