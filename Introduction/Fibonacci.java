public class  Fibonacci{

        public static void main(String[] args) {
                System.out.println("Program for Fibonacci");

                int count = 20, num1 = 0, num2 = 1;
                System.out.print("Fibonacci Series of "+count+" numbers:");

                int i=1;
                while(i<=count)
                {
                System.out.print(num1+" ");
                int sumOfPrevTwo = num1 + num2;
                num1 = num2;
                num2 = sumOfPrevTwo;
                i++;
                }
        }
}