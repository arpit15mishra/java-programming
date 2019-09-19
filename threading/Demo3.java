public class Demo3 extends Thread {
    public static int x;
    public void run() {
        for (int i = 0; i < 100; i++) {
            x = x + 1;
            System.out.println("arpit");
            x = x - 1;
            System.out.println("apoorv");
            
        }
    }
    public static void main(String[] args) {
         x = 0;
         for (int i = 0; i < 10; i++){
            new Demo3().start();
			System.out.println(x);	// x not always 0!
		 }
    }
}
