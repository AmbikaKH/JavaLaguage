package language.class13;

public class Thread2 implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("I am in thread2");
        }
    }
}
