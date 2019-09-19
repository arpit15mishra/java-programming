class ThreadID extends Thread{
    public void run(){
        try{
            System.out.println(" thread ID is :" + Thread.currentThread().getId());
        }catch(Exception ex){
            System.out.println("EXception has occured");
        }
    }
}

public class Demo2{
    public static void main(String[] args){
        for(int i = 0 ; i < 10; i++){
            ThreadID n = new ThreadID();
            n.start();
        }
    }
}