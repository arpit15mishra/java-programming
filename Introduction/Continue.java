import java.util.Scanner;
public class Continue{
    public static void main(String[] args) {
    	System.out.println("Program for Continue");
      Scanner myObj = new Scanner(System.in); 
      System.out.println("Enter number from which you want to print odd numbers"); 
      int i = myObj.nextInt(); 
      while (i >0) {
      	                i--;
					  if (i%2==0) {
					    continue;
								}
						System.out.println(i);
					  	
					} 
				}
			}