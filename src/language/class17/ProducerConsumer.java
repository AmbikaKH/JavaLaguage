package language.class17;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

class Producer implements Runnable{

    private BlockingQueue<Integer> blockingQueue;

    public Producer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    public void run(){
        while(true){
            try{

                int num = new Random().nextInt(10);
                System.out.println("Adding Number" + num);
                blockingQueue.put(num);
                Thread.sleep(500);

            }
            catch(InterruptedException e){
                e.printStackTrace();

            }
        }

    }
}

class Consumer implements Runnable{

    private BlockingQueue<Integer> blockingQueue;

    public Consumer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    public void run(){
        while(true){
            if( ! blockingQueue.isEmpty()) {
                System.out.println("Taking Out Value : " + blockingQueue.poll());
            }
        }

    }
}



public class ProducerConsumer {
    public static void main(String[] args) {

        BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<Integer>();

        Producer pt = new Producer(blockingQueue);
        Thread t = new Thread(pt);
        t.start();
        //new Thread(new Producer(blockingQueue)).start(); // This is same as above 3 lines

        Consumer ct = new Consumer(blockingQueue);
        Thread c = new Thread(ct);
        c.start();
        //new Thread(new Consumer(blockingQueue)).start(); // This is same as above 3 lines


    }
}
