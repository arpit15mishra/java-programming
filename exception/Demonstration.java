public class Demonstration{
     public static void main(String args[]){
        int a,b, result;
        a = 0;
        b = 5;
        System.out.print("enter any two integers\n");
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        System.out.println(a + b + "");

        result = a+b;
        System.out.println("result: " + result);
        
    }
}