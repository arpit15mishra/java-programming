import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	int n = inr.nextInt();
        // Add the necessary code in the below space
          int i;
      int sum = 0;
      int l = 0;
      int j;
      while(l<n){
        i=1;
      while(i<=n-l-1){
        System.out.print("  ");
        i++;
      }
      j = 1;
        while(j<=2*l+1){
        System.out.print(j+" ");
          sum += j;
          j++;}

        System.out.println("");
        l++;
      }
      System.out.println(sum);
    }
}