package language.class15;

class TestJoin implements  Runnable{

    public void run(){
        synchronized (this) {
            try {
                Thread.sleep(500);
                for (int i = 0; i < 5; i++) {
                    System.out.println("Count " + i);
                }
                System.out.println("I am in Thread" + Thread.currentThread());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class ThreadJoin {

    public static void main(String[] args) throws InterruptedException {

        TestJoin tt1 = new TestJoin();
        Thread t = new Thread(tt1);
        t.setName("Thread 1");
        t.start();
        //t.join();

        TestJoin tt2 = new TestJoin();
        Thread t2 = new Thread(tt2);
        t2.setName("Thread 2");
        t2.start();
        //t2.join();

        System.out.println("I am exiting main");

    }
}
