import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	int n = inr.nextInt();
        // Add the necessary code in the below space
          int i;
      int l = 0;
      int j;
      while(l<n){
        i=0;
      while(i<n-l-1){
        System.out.print(" ");
        i++;
      }
      j = 0;
        while(j<2*l+1){
          if(j%2==0)
        System.out.print("*");
          else System.out.print(" ");
          j++;}

        System.out.println(" ");
        l++;
      }
    }
}