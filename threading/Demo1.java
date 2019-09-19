class Thread1 extends Thread{
    public Thread1(Runnable n){
        super(n);
    }
    
}

class Thread2 extends Thread{
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("thread2 ");
        }
    }
}
class Thread4 implements Runnable{
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("thread4 ");
        }
    }
}


class Thread3 extends Thread{
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("thread3: ");
        }
    }
}

public class Demo1{
    public static void main(String[] args){
        Thread4 n4 = new Thread4();
        Thread1 n1 = new Thread1(n4);
        Thread2 n2 = new Thread2();
        Thread3 n3 = new Thread3();
        n1.start();
        n2.start();
        n3.start();
    }
}