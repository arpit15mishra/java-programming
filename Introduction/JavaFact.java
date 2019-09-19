public class JavaFact {
                     /* using Forloop */
    public static void main(String[] args) {
            System.out.println("Program for For Factorial using for loop");
        int number = 5;
        int fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}