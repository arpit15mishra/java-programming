class JavaFact2 {
// using recursion  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){ 
	System.out.println("Program for Factorial using recursion"); 
  int i,fact=1;  
  int number=4;   
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  