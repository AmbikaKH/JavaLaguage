package language.class15;

class ThreadTest{
    public void PrintNumbers() {
    //public synchronized void PrintNumbers() {    // Method synchronize
        System.out.println(Thread.currentThread());
        synchronized (this) {     //Block synchronize
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        }

    }
}

class ThreadEx1 implements Runnable{


    ThreadTest t;

    ThreadEx1(ThreadTest tobj){
        this.t = tobj;
    }
    @Override
    public void run(){
            t.PrintNumbers();

    }
}

public class ThreadSynchronize {
    public static void main(String[] args) throws InterruptedException {


        ThreadTest t = new ThreadTest();
        ThreadEx1 tt1 = new ThreadEx1(t);
        Thread td1 = new Thread(tt1);
        td1.setName("Thread 1");
        td1.start();

        ThreadEx1 tt2 = new ThreadEx1(t);
        Thread td2 = new Thread(tt2);
        td2.setName("Thread 2");
        td2.start();

    }
}
