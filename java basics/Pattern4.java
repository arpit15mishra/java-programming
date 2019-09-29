import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	int n = inr.nextInt();
        // Add the necessary code in the below space
      if(n%2==0){
        System.out.println("Invalid line number");
      }else{
      int i;
      int l = 0;
      int j;
      while(l<=n/2){
        i=0;
      while(i<=n/2-l-1){
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
      l=n/2-1;
      while(l>=0){
        i=0;
      while(i<=n/2-l-1){
        System.out.print(" ");
        i++;
      }
      j = 0;
        while(j<2*l+1){
        if(j%2==0)
        System.out.print("*");
        else System.out.print(" ");
          j++;}

        System.out.println("");
        l--;
      }
     }
    }
}